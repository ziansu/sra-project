protected boolean isHovered(int mouseX, int mouseY) {
    return (((mouseX >= (xPosition)) && (mouseX <= ((xPosition) + (width)))) && (mouseY >= (yPosition))) && (mouseY <= ((yPosition) + (height)));
}