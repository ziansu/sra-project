public void LogErrorKnownObjects(tilda.parsing.parts.Schema S) {
    tilda.parsing.parts.helpers.ReferenceHelper.LOG.error((((("Cannot find Object '" + (_S)) + ".") + (_O)) + "'."));
    tilda.parsing.parts.helpers.ReferenceHelper.LOG.debug((("Known Objects from Schema " + (S.getFullName())) + ": "));
    for (java.lang.Object o : S._Objects)
        tilda.parsing.parts.helpers.ReferenceHelper.LOG.debug(("   - " + (o.getFullName())));
    
}