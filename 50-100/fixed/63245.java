private void moveUp() {
    (histPosition)++;
    if ((histPosition) > (lines.size())) {
        histPosition = lines.size();
    }
    if (!(lines.isEmpty()))
        typeText(lines.get(((lines.size()) - (histPosition))), true);
    
}