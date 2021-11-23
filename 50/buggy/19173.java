public de.slackspace.openkeepass.domain.zipper.GroupZipper replace(de.slackspace.openkeepass.domain.Group group) {
    parent.getNode().getGroups().set(index, group);
    return this;
}