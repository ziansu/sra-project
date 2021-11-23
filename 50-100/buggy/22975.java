private java.lang.String getStringFromRegion(char[] source, org.eclipse.jface.text.IRegion region) {
    java.lang.String str = "";
    int beginIndex = region.getOffset();
    int endIndex = beginIndex + (region.getLength());
    for (int i = beginIndex; i < endIndex; i++) {
        str += source[i];
    }
    return str;
}