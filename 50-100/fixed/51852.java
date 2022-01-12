private void addChar(java.lang.String characterTyped) {
    javafx.scene.text.Text nextText = new javafx.scene.text.Text(characterTyped);
    nextText.setTextOrigin(javafx.geometry.VPos.TOP);
    nextText.setFont(javafx.scene.text.Font.font(fontName, fontSize));
    textList.addAtCurrentNode(nextText);
    root.getChildren().add(nextText);
}