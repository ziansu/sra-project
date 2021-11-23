protected void copyDefinitionData(com.evolveum.midpoint.prism.PrismContainerDefinition<C> clone) {
    super.copyDefinitionData(clone);
    clone.complexTypeDefinition = this.complexTypeDefinition;
    clone.compileTimeClass = this.compileTimeClass;
}