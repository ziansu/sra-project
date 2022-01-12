private void moveDown() {
    (histPosition)--;
    if ((histPosition) <= 0) {
        histPosition = 0;
        typeText("", false);
    }else
        typeText(lines.get(((lines.size()) - (histPosition))), true);
    
}