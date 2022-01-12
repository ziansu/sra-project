private net.thucydides.core.requirements.model.Requirement requirementFromDirectoryName(java.io.File requirementDirectory) {
    java.lang.System.out.println(("Reading requirement from directory name " + requirementDirectory));
    java.lang.String shortName = humanReadableVersionOf(requirementDirectory.getName());
    java.util.List<net.thucydides.core.requirements.model.Requirement> children = readChildrenFrom(requirementDirectory);
    return net.thucydides.core.requirements.model.Requirement.named(shortName).withType(getDefaultType(level)).withNarrative(shortName).withChildren(children);
}