@java.lang.Override
protected void drawSelf(com.katzstudio.kreativity.ui.render.KrRenderer renderer) {
    renderer.setBrush(new com.katzstudio.kreativity.ui.render.KrDrawableBrush(style.background));
    renderer.fillRect(getX(), getY(), getWidth(), getHeight());
    if (isChecked) {
        renderer.setBrush(new com.katzstudio.kreativity.ui.render.KrDrawableBrush(style.mark));
        renderer.fillRect(getX(), getY(), getWidth(), getHeight());
    }
}