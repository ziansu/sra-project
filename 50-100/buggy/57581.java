private int handleWordWrap(int charHeight, editor.FastLinkedList.Node n) {
    yPos += charHeight;
    xPos = 0;
    if (((wordLegnth) + (newCharWidth)) < (editor.Editor.WINDOW_WIDTH)) {
        xPos = bringWordDown(wordStart, n, xPos, yPos);
        lineMap.put((++(currentLine)), wordStart);
    }else {
        lineMap.put((++(currentLine)), n);
    }
    (maxLine)++;
    return xPos;
}