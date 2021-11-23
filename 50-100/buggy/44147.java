public void OnDrag(com.mygdx.game.InputManager.TouchData td) {
    if (cM.getPlayer().isInOrbit()) {
        java.lang.System.out.println(td.getDeltaSwipe());
        cM.addTranslation(new com.badlogic.gdx.math.Vector2((-(td.getDeltaSwipe().x)), td.getDeltaSwipe().y));
    }
}