@java.lang.Override
public net.tjeerd.onedrive.json.folder.Folder getMyFilesList(net.tjeerd.onedrive.enums.FriendlyNamesEnum friendlyNamesEnum) throws java.lang.Exception {
    java.lang.String apiPath = net.tjeerd.onedrive.core.OneDrive.API_PATH_ME_SKYDRIVE;
    if (friendlyNamesEnum.equals(FriendlyNamesEnum.ALL)) {
        apiPath += "/" + (net.tjeerd.onedrive.core.OneDrive.API_PATH_FILES);
    }else {
        apiPath += (("/" + (friendlyNamesEnum.toString())) + "/") + (net.tjeerd.onedrive.core.OneDrive.API_PATH_FILES);
    }
    return ((net.tjeerd.onedrive.json.folder.Folder) (oneDriveCore.doGetAPI(new com.sun.jersey.core.util.MultivaluedMapImpl(), MediaType.APPLICATION_JSON, apiPath, new net.tjeerd.onedrive.json.folder.Folder())));
}