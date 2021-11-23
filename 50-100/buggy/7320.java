private java.lang.String getTrailerID(org.verapdf.model.impl.pb.cos.COSArray ids) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (org.verapdf.model.impl.pb.cos.COSBase id : ids) {
        builder.append(((org.verapdf.model.impl.pb.cos.COSString) (id)).getASCII()).append(' ');
    }
    return builder.toString().substring(0, ((builder.length()) - 2));
}