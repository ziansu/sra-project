void onMouseReleased() {
    for (com.dreamteam.villageTycoon.framework.GameObject g : getScene().getObjects()) {
        if (g instanceof java.lang.Character) {
            ((java.lang.Character) (g)).setSelected(((java.lang.Character) (g)).getHitbox().collision(selectionRectangle));
        }
    }
}