private org.obeonetwork.m2doc.provider.IProvider getFirstProvider(org.obeonetwork.m2doc.template.Representation representation, java.util.Map<java.lang.String, java.lang.String> options, java.util.List<org.obeonetwork.m2doc.provider.IProvider> providers) {
    for (org.obeonetwork.m2doc.provider.IProvider provider : providers) {
        java.util.Set<java.lang.String> providerOptions = ((provider.getOptionTypes()) == null) ? new java.util.HashSet<java.lang.String>(0) : provider.getOptionTypes().keySet();
        if (checkImagesOptions(options, representation, org.obeonetwork.m2doc.parser.BodyParser.DIAGRAM_OPTION_SET, providerOptions, false)) {
            return provider;
        }
    }
    return null;
}