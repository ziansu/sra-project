protected java.util.List retrieveClassesForIngredients() {
    if (getFixSpace().strategy().equals(IngredientSpaceStrategy.LOCAL))
        return originalVariant.getAffectedClasses();
    
    if ((getFixSpace().strategy().equals(IngredientSpaceStrategy.GLOBAL)) || (getFixSpace().strategy().equals(IngredientSpaceStrategy.PACKAGE)))
        return this.mutatorSupporter.getFactory().Type().getAll();
    
    return null;
}