public static com.google.api.codegen.util.Name upperCamel(java.lang.String... pieces) {
    java.util.List<com.google.api.codegen.util.Name.NamePiece> namePieces = new java.util.ArrayList<>();
    for (java.lang.String piece : pieces) {
        piece = piece.replace("IAM", "Iam");
        com.google.api.codegen.util.Name.validateCamel(piece, true);
        namePieces.add(new com.google.api.codegen.util.Name.NamePiece(piece, com.google.common.base.CaseFormat.UPPER_CAMEL));
    }
    return new com.google.api.codegen.util.Name(namePieces);
}