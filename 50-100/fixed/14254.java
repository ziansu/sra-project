public static java.lang.String formatToRuntimePath(java.lang.String folder, java.lang.String idePath) {
    java.lang.StringBuilder path = new java.lang.StringBuilder(idePath);
    int indexOfWorkspace = path.indexOf(IRepositoryPaths.WORKSPACE_FOLDER_NAME);
    int indexOfSlash = path.indexOf(ICommonConstants.SEPARATOR, indexOfWorkspace);
    path.replace(0, indexOfSlash, ICommonConstants.EMPTY_STRING);
    int indexOfFolder = path.indexOf(folder);
    path.replace(0, (indexOfFolder + (folder.length())), ICommonConstants.EMPTY_STRING);
    return path.toString();
}