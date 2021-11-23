pl.karol202.evolution.utils.Vector2 getVector(java.lang.String key) {
    org.w3c.dom.Element vectorElement = getVectorElementFromListByName(key);
    if (vectorElement == null)
        return null;
    
    return new pl.karol202.evolution.utils.Vector2(java.lang.Float.parseFloat(vectorElement.getAttribute("x")), java.lang.Float.parseFloat(vectorElement.getAttribute("y")));
}