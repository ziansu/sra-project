public void onAction(java.lang.String name, boolean isPressed, float tpf) {
    if (isPressed) {
        if (!(raining)) {
            raining = true;
            makeItRain();
            java.lang.System.out.println(rain.getLocalTranslation());
        }else {
            raining = false;
            rain.removeControl(this);
            rainNode.detachChild(rain);
        }
    }
}