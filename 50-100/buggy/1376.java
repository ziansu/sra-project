public java.lang.String toXml(int offset) {
    java.lang.StringBuffer buffer = new java.lang.StringBuffer();
    edu.stanford.nlp.ie.machinereading.domains.ace.reader.AceElement.appendOffset(buffer, (offset + 2));
    buffer.append((((((("<charseq START=\"" + (mByteOffset.start())) + "\" END=\"") + (mByteOffset.end())) + "\">") + (mText)) + "</charseq>"));
    return buffer.toString();
}