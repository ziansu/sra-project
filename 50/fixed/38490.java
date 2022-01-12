public void setGroups(org.apache.pivot.collections.List<dcp.logic.model.Group> groups) {
    this.groups.clear();
    for (dcp.logic.model.Group g : groups) {
        this.groups.add(new dcp.logic.model.Group(g));
    }
}