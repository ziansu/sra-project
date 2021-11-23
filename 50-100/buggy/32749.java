@java.lang.Override
public java.lang.Object visitTupleTypeSpecifier(@org.cqframework.cql.cql2elm.NotNull
org.cqframework.cql.cql2elm.TupleTypeSpecifierContext ctx) {
    org.cqframework.cql.cql2elm.TupleType resultType = new org.cqframework.cql.cql2elm.TupleType();
    org.cqframework.cql.cql2elm.TupleTypeSpecifier typeSpecifier = of.createTupleTypeSpecifier();
    for (org.cqframework.cql.cql2elm.TupleElementDefinitionContext definitionContext : ctx.tupleElementDefinition()) {
        org.cqframework.cql.cql2elm.TupleElementDefinition element = ((org.cqframework.cql.cql2elm.TupleElementDefinition) (visit(definitionContext)));
        resultType.addElement(new org.cqframework.cql.cql2elm.TupleTypeElement(element.getName(), element.getResultType()));
        typeSpecifier.getElement().add(element);
    }
    typeSpecifier.setResultType(resultType);
    return typeSpecifier;
}