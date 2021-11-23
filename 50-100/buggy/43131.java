private java.util.List<hudson.model.Run> fromMemoryImprintToBuilds(com.sonyericsson.hudson.plugins.gerrit.trigger.gerritnotifier.model.BuildMemory.MemoryImprint memoryImprint) {
    final java.util.List<hudson.model.Run> runs = new java.util.ArrayList<hudson.model.Run>(memoryImprint.getEntries().length);
    for (com.sonyericsson.hudson.plugins.gerrit.trigger.gerritnotifier.model.BuildMemory.MemoryImprint.Entry entry : memoryImprint.getEntries()) {
        if (entry == null) {
            continue;
        }
        runs.add(entry.getBuild());
    }
    return runs;
}