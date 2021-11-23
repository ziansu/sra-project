private java.lang.String buildName(org.osate.aadl2.instance.ComponentInstance component, org.osate.aadl2.NamedElement namedElement, org.osate.xtext.aadl2.errormodel.errorModel.TypeSet typeSet) {
    java.lang.String name = ((eventIdentifier) + "-") + (buildIdentifier(component, namedElement, typeSet));
    name = name.replaceAll("\\{", "").replaceAll("\\}", "").toLowerCase();
    eventIdentifier = (eventIdentifier) + 1;
    return name;
}