public void onDraw(org.terasology.rendering.nui.Canvas canvas) {
    canvas.getRegion();
    if ((icon) != null) {
        canvas.drawTexture(icon, sectionRegion);
    }
    canvas.drawTexture(sectionTexture, sectionRegion);
    if ((text) != null) {
        canvas.drawText(text, sectionRegion);
    }
    if (isSelected) {
        canvas.drawTexture(selectedTexture, canvas.getRegion());
        canvas.drawWidget(info, infoRegion);
    }
}