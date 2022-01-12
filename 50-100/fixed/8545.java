public static org.apache.lens.cube.parse.ASTNode parseExpr(java.lang.String expr) throws org.apache.lens.server.api.error.LensException {
    org.apache.lens.cube.parse.ParseDriver driver = new org.apache.lens.cube.parse.ParseDriver();
    org.apache.lens.cube.parse.ASTNode tree;
    try {
        tree = driver.parseExpression(expr);
    } catch (org.apache.lens.cube.parse.ParseException e) {
        throw new org.apache.lens.server.api.error.LensException(org.apache.lens.cube.error.LensCubeErrorCode.COULD_NOT_PARSE_EXPRESSION.getLensErrorInfo(), e, expr);
    }
    return org.apache.lens.cube.parse.ParseUtils.findRootNonNullToken(tree);
}