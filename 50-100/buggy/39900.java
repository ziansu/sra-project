private java.util.List<net.thucydides.core.requirements.model.Requirement> readChildrenFrom(java.io.File requirementDirectory) {
    java.lang.String childDirectory = ((rootDirectoryPath) + "/") + (requirementDirectory.getName());
    if (new java.io.File(childDirectory).exists()) {
        net.thucydides.core.requirements.RequirementsTagProvider childReader = new net.thucydides.core.requirements.FileSystemRequirementsTagProvider(childDirectory, ((level) + 1), environmentVariables);
        return childReader.getRequirements();
    }else {
        return com.google.common.collect.Lists.newArrayList();
    }
}