private boolean isManyToMany() {
    boolean isNotHaveAttributes = (joinEntity.getAttributes().size()) == 0;
    return ((((((isNotHaveAttributes && ((reverseRelationship1) != null)) && (reverseRelationship1.isToDependentPK())) && ((reverseRelationship2) != null)) && (reverseRelationship2.isToDependentPK())) && ((entity1) != null)) && ((entity2) != null)) && (!(entity1.equals(entity2)));
}