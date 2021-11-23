private int handleWordWrap(int charHeight, editor.FastLinkedList.Node n) {
    yPos += charHeight;
    xPos = 0;
    if (((wordLegnth) + (newCharWidth)) < (editor.Editor.WINDOW_WIDTH)) {
        lineMap.put((++(currentLine)), wordStart);
        xPos = bringWordDown(wordStart, n, xPos, yPos);
    }else {
        lineMap.put((++(currentLine)), n);
    }
    return xPos;
}