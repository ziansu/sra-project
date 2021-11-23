@java.lang.Override
public void loadInput(java.lang.String name) {
    org.eclipse.core.resources.IFile inputFile = inputFile = project.getFile(name);
    logger.info(("VibeKVPair Message: Loading" + (inputFile.getFullPath().toOSString())));
    form = read(inputFile);
    form.setName(getName());
    form.setDescription(getDescription());
    form.setId(getId());
    form.setItemID(getId());
    form.setActionList(actionItems);
}