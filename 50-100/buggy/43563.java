public void foundProperty(org.yarnandtail.andhow.compile.SimpleVariable variableElement) {
    if ((variableElement.isStatic()) && (variableElement.isFinal())) {
        if ((registrations) == null) {
            registrations = new org.yarnandtail.andhow.compile.PropertyRegistrationList(classCanonName);
        }
        registrations.add(variableElement.getName(), getInnerPathNames());
    }else {
        addPropertyError(variableElement.getName(), "New AndHow Properties must be assigned to a static final field.");
    }
}