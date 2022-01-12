@java.lang.Override
public java.lang.String getLabel(java.lang.String section, java.lang.String name, java.lang.Object... params) {
    java.util.Map<java.lang.String, java.lang.String> label = org.auraframework.impl.context.LocalizationAdapterImpl.labels.get(name);
    if (label == null) {
        if (org.auraframework.impl.context.LocalizationAdapterImpl.testLabels.containsKey(getLabelKey(section, name))) {
            return org.auraframework.impl.context.LocalizationAdapterImpl.testLabels.get(getLabelKey(section, name));
        }
        return "FIXME - LocalizationAdapter.getLabel() needs implementation!";
    }
    return label.get(this.getAuraLocale().getLanguageLocale().toString());
}