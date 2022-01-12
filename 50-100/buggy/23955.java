@java.lang.Override
public void execute() throws java.lang.Exception {
    for (org.dkpro.lab.task.TaskContextMetadata subcontext : getSubtasks()) {
        if (subcontext.getType().contains(org.dkpro.tc.examples.single.sequence.ContextMemoryReport.adapter)) {
            org.dkpro.lab.storage.StorageService storageService = getContext().getStorageService();
            org.dkpro.tc.examples.single.sequence.ContextMemoryReport.out = storageService.locateKey(subcontext.getId(), "");
            return ;
        }
    }
}