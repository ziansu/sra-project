static java.lang.String wrapTextRec(java.lang.String text, int maxLineLen, java.lang.StringBuilder sb) {
    if ((text.length()) <= maxLineLen) {
        sb.append(text);
        return sb.toString();
    }else {
        java.lang.String head = text.substring(0, maxLineLen);
        java.lang.String tail = text.substring(maxLineLen);
        sb.append(head).append(org.nextprot.api.commons.utils.StringUtils.CR_LF);
        return org.nextprot.api.commons.utils.StringUtils.wrapTextRec(tail, maxLineLen, sb);
    }
}