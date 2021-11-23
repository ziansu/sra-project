@java.lang.Override
public com.microsoft.azure.management.compute.implementation.VirtualMachineImpl withNewStorageAccount(java.lang.String name) {
    com.microsoft.azure.management.storage.StorageAccount.DefinitionWithGroup definitionWithGroup = this.storageManager.storageAccounts().define(name).withRegion(this.region());
    com.microsoft.azure.management.storage.StorageAccount.DefinitionCreatable definitionAfterGroup;
    if ((this.newGroup) != null) {
        definitionAfterGroup = definitionWithGroup.withNewGroup(this.newGroup);
    }else {
        definitionAfterGroup = definitionWithGroup.withExistingGroup(this.resourceGroupName());
    }
    return withNewStorageAccount(definitionAfterGroup);
}