public void update() {
    if (((lastCode) != (-1)) && ((nextChar) < (java.lang.System.currentTimeMillis()))) {
        keyTyped(lastChar, lastCode);
        nextChar = (java.lang.System.currentTimeMillis()) + (com.besuikerd.autologistics.client.lib.gui.element.Element.THRESHOLD_NEXT_KEY_TYPED);
        java.lang.System.out.println(("TYPED: " + (getClass().getSimpleName())));
    }
    doTrigger(Trigger.UPDATE);
}