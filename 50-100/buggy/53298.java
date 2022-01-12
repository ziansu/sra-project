@java.lang.Override
public void headerFooter(java.lang.String text, boolean isHeader, java.lang.String tagName) {
    if (isHeader) {
        sb.append((((("<header tagName=\"" + tagName) + "\">") + text) + "</header>"));
    }else {
        sb.append((((("<footer tagName=\"" + tagName) + "\">") + text) + "</footer>"));
    }
}