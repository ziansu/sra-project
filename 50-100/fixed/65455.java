private void moveDown() {
    (histPosition)--;
    if ((histPosition) <= 0) {
        histPosition = 0;
        typeText("", false);
    }else
        if (!(lines.isEmpty()))
            typeText(lines.get(((lines.size()) - (histPosition))), true);
        
    
}