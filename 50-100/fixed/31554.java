public static java.lang.String combineQRCodes(java.util.ArrayList<java.lang.String> codes) {
    java.lang.StringBuilder combined = new java.lang.StringBuilder();
    combined.append(codes.get(0));
    for (int i = 1; i < (codes.size()); i++) {
        combined.append(soft.swenggroup5.DecoderUtils.getFileData(codes.get(i)));
    }
    return combined.toString();
}