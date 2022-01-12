@java.lang.Override
public com.emc.documentum.dtos.DocumentumObject getObjectById(java.lang.String cabinetId) throws com.emc.documentum.exceptions.CabinetNotFoundException, com.emc.documentum.exceptions.RepositoryNotAvailableException {
    return com.emc.documentum.transformation.DCD2Transformation.convertD2DocItemObject(dcAPI.getObjectById(cabinetId), dcAPI.getContext());
}