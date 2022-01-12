private void pickColor(int x, int y, int mouseButton) {
    java.awt.Color color = new java.awt.Color(image.getRGB(x, y), true);
    if (mouseButton == (draw.DrawAreaController.Mouse.LeftButton))
        drawSettings.setForegroundColor(color);
    else
        drawSettings.setBackgroundColor(color);
    
    toolController.selectTool(lastNonColorPickerTool);
}