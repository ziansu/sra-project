private static javafx.geometry.Bounds getBounds(editor.DrawableNode node) {
    java.lang.String string = node.getText();
    if (string.startsWith("-")) {
    }
    if (string.endsWith(" ")) {
        string += ".";
    }
    javafx.scene.text.Text text = new javafx.scene.text.Text(string);
    text.setFont(javafx.scene.text.Font.font(node.getFont(), node.getFontSize()));
    return text.getBoundsInLocal();
}