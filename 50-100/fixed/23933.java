private static java.lang.String getAddSharedFolderCommand(java.lang.String engineName, java.util.Map.Entry<java.lang.String, java.lang.String> sharedFolder) {
    java.lang.StringBuilder sharedFolderCommand = new java.lang.StringBuilder();
    sharedFolderCommand.append(ngspipesengine.configurator.properties.VMProperties.getSharedFolderCommand(Utils.SHARE_FODLER_ADD_COMMAND, engineName, sharedFolder.getKey())).append(Utils.HOST_PATH_OPTION).append(Engine.OS_PATH_FORMATTERS.get(Utils.OS_TYPE).apply(sharedFolder.getValue()));
    return sharedFolderCommand.toString();
}