void associateGroup() {
    java.lang.Integer groupCount = dataCenter.groupCount;
    java.lang.Integer currentGroup = 0;
    for (fr.xebia.google.hashcode.model.Row row : dataCenter.getRows()) {
        java.util.List<fr.xebia.google.hashcode.model.Server> servers = dataCenter.findServerByIndiceRow(row.getIndice());
        currentGroup = 0;
        for (fr.xebia.google.hashcode.model.Server server : servers) {
            server.group = currentGroup;
            currentGroup = nextGroup(currentGroup, groupCount);
        }
    }
}