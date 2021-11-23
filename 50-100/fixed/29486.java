public static yaplstack.ast.AST fn(java.lang.String[] params, yaplstack.ast.AST code) {
    return new yaplstack.ast.AST() {
        @java.lang.Override
        public <T> T accept(yaplstack.ast.AST.Visitor<T> visitor) {
            return visitor.visitFN(java.util.Arrays.asList(params), code);
        }
    };
}