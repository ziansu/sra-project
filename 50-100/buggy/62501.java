private java.lang.String buildIdentifier(org.osate.aadl2.instance.ComponentInstance component, org.osate.aadl2.NamedElement namedElement, org.osate.xtext.aadl2.errormodel.errorModel.TypeSet typeSet) {
    java.lang.String identifier = ((eventIdentifier) + "-") + (buildName(component, namedElement, typeSet));
    identifier = identifier.replaceAll("\\{", "").replaceAll("\\}", "").toLowerCase();
    return identifier;
}