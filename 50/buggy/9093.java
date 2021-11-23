public static org.neo4j.codegen.Expression get(final org.neo4j.codegen.FieldReference field) {
    return new org.neo4j.codegen.Expression(field.type()) {
        @java.lang.Override
        public void accept(org.neo4j.codegen.ExpressionVisitor visitor) {
            visitor.getStatic(field);
        }
    };
}