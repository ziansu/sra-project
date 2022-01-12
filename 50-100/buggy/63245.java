private void moveUp() {
    (histPosition)++;
    if ((histPosition) > (lines.size())) {
        histPosition = lines.size();
    }
    typeText(lines.get(((lines.size()) - (histPosition))), true);
}