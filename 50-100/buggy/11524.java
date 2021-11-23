public java.lang.String findParameterInExtension(org.eclipse.core.runtime.IConfigurationElement configurationElement, java.lang.String parameter) {
    for (org.eclipse.core.runtime.IConfigurationElement configurationElementChild : configurationElement.getChildren(parameter)) {
        if ((configurationElementChild.getAttribute(parameter)) != null) {
            return configurationElementChild.getAttribute(parameter);
        }
    }
    return null;
}