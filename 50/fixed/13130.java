public entity.ResultSet changeDirectory(java.lang.String newDirectory) {
    commitFullSave();
    entity.ResultSet saveSuccess = dataLoader.saveTo(newDirectory);
    return saveSuccess;
}