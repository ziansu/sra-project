public void setText(java.lang.String text) {
    textLines = text.split("\n");
    java.lang.String html = "<html>";
    for (int i = 0; i < (textLines.length); i++) {
        if (i > 0) {
            html = html + "<br>";
        }
        html = html + (textLines[i]);
    }
    super.setText(html);
}