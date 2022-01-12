@java.lang.Override
public void visitStringNode(org.maxwe.epub.parser.Text string) {
    if (flag) {
        java.lang.String text = string.getText();
        if (!("".equals(text.trim().replaceAll(java.lang.System.getProperty("line.separator"), "")))) {
            linkedHashMap.put(attribute, text);
        }
    }
}