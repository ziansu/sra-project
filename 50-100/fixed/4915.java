private static java.lang.String FormatText(java.lang.Object text) {
    java.lang.String output = (text == null) ? "<null>" : java.lang.String.valueOf(text);
    if ((Singletons.ExperimentItems) != null)
        output = ((((Singletons.ExperimentItems.Description) + " | ") + (Singletons.ExperimentItems.AlgorithmScriptFilePath)) + " | ") + output;
    
    return output;
}