public java.lang.String toXml(int offset) {
    java.lang.StringBuffer buffer = new java.lang.StringBuffer();
    edu.stanford.nlp.ie.machinereading.domains.ace.reader.AceElement.appendOffset(buffer, (offset + 2));
    buffer.append("<charseq START=\"").append(mByteOffset.start()).append("\" END=\"").append(mByteOffset.end()).append("\">");
    buffer.append(mText).append("</charseq>");
    return buffer.toString();
}