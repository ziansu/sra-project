public boolean switchButtonHitTest(com.ezardlabs.dethsquare.Touch t) {
    return (((t.phase) == (com.ezardlabs.dethsquare.Touch.TouchPhase.BEGAN)) && (switchButton.hitTest(t.startPosition))) && (switchButton.hitTest(t.position));
}