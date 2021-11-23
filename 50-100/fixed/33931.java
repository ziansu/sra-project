protected static java.util.ArrayList<java.lang.String> sliceContent(java.lang.String content) {
    java.util.ArrayList<java.lang.String> slicedContent = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] contentPieces = content.trim().split("\\s+");
    for (java.lang.String pieceOfContent : contentPieces) {
        slicedContent.add(pieceOfContent);
    }
    return slicedContent;
}