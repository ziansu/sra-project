protected boolean indexAppliesTo(org.modeshape.jcr.query.model.Or or) {
    return (indexAppliesTo(or.getConstraint1())) && (indexAppliesTo(or.getConstraint2()));
}