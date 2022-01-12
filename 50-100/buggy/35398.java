public java.lang.String toString() {
    java.lang.StringBuffer sb = new java.lang.StringBuffer((("VendorString '" + (vendorString)) + "\'\n"));
    sb.append((("VorbisComment (count=" + (numComments)) + ")"));
    for (int i = 0; i < (numComments); i++) {
        sb.append(("\n\t" + (comments[i].toString())));
    }
    return sb.toString();
}