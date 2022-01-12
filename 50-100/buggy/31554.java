public static java.lang.String combineQRCodes(java.util.ArrayList<java.lang.String> codes) {
    java.lang.StringBuilder combined = new java.lang.StringBuilder();
    combined.append(codes.get(0));
    for (java.lang.String code : codes) {
        combined.append(soft.swenggroup5.DecoderUtils.getFileData(code));
    }
    return combined.toString();
}