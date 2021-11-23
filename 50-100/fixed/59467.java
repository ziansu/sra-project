private static java.lang.String constructUserMessage(org.neo4j.kernel.api.exceptions.schema.OperationContext context, org.neo4j.kernel.api.TokenNameLookup tokenNameLookup, org.neo4j.kernel.api.constraints.PropertyConstraint constraint) {
    switch (context) {
        case INDEX_CREATION :
            org.neo4j.kernel.api.constraints.NodePropertyConstraint nodePropertyConstraint = ((org.neo4j.kernel.api.constraints.NodePropertyConstraint) (constraint));
            return messageWithLabelAndPropertyName(tokenNameLookup, org.neo4j.kernel.api.exceptions.schema.AlreadyConstrainedException.INDEX_CONTEXT_FORMAT, nodePropertyConstraint.descriptor());
        case CONSTRAINT_CREATION :
            return (org.neo4j.kernel.api.exceptions.schema.AlreadyConstrainedException.ALREADY_CONSTRAINED_MESSAGE_PREFIX) + (constraint.userDescription(tokenNameLookup));
        default :
            return java.lang.String.format(org.neo4j.kernel.api.exceptions.schema.AlreadyConstrainedException.NO_CONTEXT_FORMAT, constraint);
    }
}