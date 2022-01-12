public void onDraw(org.terasology.rendering.nui.Canvas canvas) {
    canvas.getRegion();
    canvas.drawTexture(sectionTexture, sectionRegion);
    if ((icon) != null) {
    }
    if ((text) != null) {
    }
    if (isSelected) {
        canvas.drawTexture(selectedTexture, sectionRegion);
        canvas.drawWidget(info, infoRegion);
    }
}