private void handleCompletePlural(java.lang.String singular, java.lang.String modernPlural, java.lang.String classicalPlural) {
    bjc.inflexion.v2.InflectionAffix singularAffix = complete(singular.substring(1));
    bjc.inflexion.v2.InflectionAffix modernAffix = null;
    bjc.inflexion.v2.InflectionAffix classicalAffix = null;
    if (modernPlural != null)
        modernAffix = complete(modernPlural.substring(1));
    
    if (classicalPlural != null)
        classicalAffix = complete(classicalPlural.substring(1));
    
    bjc.inflexion.v2.CategoricalNounInflection inflection = new bjc.inflexion.v2.CategoricalNounInflection(singularAffix, modernAffix, classicalAffix);
    predefinedInflections.add(inflection);
}