pl.karol202.evolution.utils.Vector2 getVector(java.lang.String key) {
    org.w3c.dom.Element vectorElement = getVectorElementFromListByName(key);
    if (vectorElement == null)
        throw new pl.karol202.evolution.utils.SimulationParseException(("Vector element not found: " + key));
    
    return new pl.karol202.evolution.utils.Vector2(java.lang.Float.parseFloat(element.getAttribute("x")), java.lang.Float.parseFloat(element.getAttribute("y")));
}