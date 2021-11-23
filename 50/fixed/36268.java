@java.lang.Override
public java.util.ArrayList<com.emc.documentum.dtos.DocumentumFolder> getAllCabinets(int pageNumber, int pageSize) throws com.emc.documentum.exceptions.RepositoryNotAvailableException {
    return com.emc.documentum.transformation.DCD2Transformation.convertD2DocItemObjectList(dcAPI.getAllCabinets(pageNumber, pageSize), dcAPI.getContext());
}