@java.lang.Override
public java.lang.Boolean visitField(io.crate.analyze.symbol.Field field, java.lang.Void context) {
    java.lang.Boolean result = io.crate.analyze.relations.RelationNormalizer.AggregateFunctionReferenceFinder.FIELD_RELATION_VISITOR.process(field.relation(), field);
    return (result != null) && result;
}