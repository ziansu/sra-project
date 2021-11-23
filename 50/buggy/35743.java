private boolean isFormDefined() {
    return (com.silverpeas.util.StringUtil.isDefined(modelId)) && (modelId.endsWith(".xml"));
}