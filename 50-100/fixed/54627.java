@org.jetbrains.annotations.Nullable
@java.lang.Override
public jetbrains.buildServer.clouds.InstanceStatus getInstanceStatusIfExists(@org.jetbrains.annotations.NotNull
jetbrains.buildServer.clouds.azure.asm.AzureCloudInstance instance) {
    final java.util.Map<java.lang.String, jetbrains.buildServer.clouds.azure.asm.connector.AzureInstance> instanceMap = listImageInstances(instance.getImage());
    final jetbrains.buildServer.clouds.azure.asm.connector.AzureInstance instanceData = instanceMap.get(instance.getInstanceId());
    if (instanceData == null) {
        return null;
    }
    return instanceData.getInstanceStatus();
}