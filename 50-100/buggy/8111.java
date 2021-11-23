void onMouseReleased() {
    java.lang.System.out.println("mouse released");
    for (com.dreamteam.villageTycoon.framework.GameObject g : getScene().getObjects()) {
        if (g instanceof java.lang.Character) {
            ((java.lang.Character) (g)).setSelected(((java.lang.Character) (g)).getHitbox().collision(selectionRectangle));
        }
    }
}