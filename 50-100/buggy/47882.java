public java.lang.Object parseXMLObject(dr.evomodelxml.coalescent.XMLObject xo) throws dr.evomodelxml.coalescent.XMLParseException {
    dr.evolution.util.Units.Type units = XMLUnits.Utils.getUnitsAttr(xo);
    dr.evomodelxml.coalescent.XMLObject cxo = xo.getChild(dr.evomodelxml.coalescent.ConstantPopulationModelParser.POPULATION_SIZE);
    beast.core.parameter.RealParameter N0Param = ((beast.core.parameter.RealParameter) (cxo.getChild(beast.core.parameter.RealParameter.class)));
    beast.evolution.tree.coalescent.ConstantPopulation cp = new beast.evolution.tree.coalescent.ConstantPopulation();
    cp.popSizeParameter.setValue(N0Param.getValue(), cp);
    return cp;
}