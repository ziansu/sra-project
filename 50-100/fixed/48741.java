public java.lang.String getValueOfGlobalAttributeWithNameLike(java.lang.String name) {
    for (opendap.dap4.ContainerAttribute containerAttribute : attributes) {
        for (opendap.dap4.Attribute a : containerAttribute.getAttributes()) {
            if (caseInsensitiveStringContains(a.getName(), name))
                return a.getValue();
            
        }
    }
    return null;
}