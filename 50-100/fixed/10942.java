protected java.util.List retrieveClassesForIngredients() {
    if ((getFixSpace().strategy().equals(IngredientSpaceStrategy.LOCAL)) || (getFixSpace().strategy().equals(IngredientSpaceStrategy.PACKAGE)))
        return originalVariant.getAffectedClasses();
    
    if (getFixSpace().strategy().equals(IngredientSpaceStrategy.GLOBAL))
        return this.mutatorSupporter.getFactory().Type().getAll();
    
    return null;
}