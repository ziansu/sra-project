public void onAction(java.lang.String name, boolean isPressed, float tpf) {
    if (isPressed) {
        if (!(raining)) {
            raining = true;
            makeItRain();
        }else {
            raining = false;
            rain.removeControl(this);
            rainNode.detachChild(rain);
        }
    }
}