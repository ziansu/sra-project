@java.lang.Override
public com.softserve.osbb.model.Contract getOneContractBySearchTerm(java.lang.String searchTerm) throws java.lang.Exception {
    return (searchTerm != null) || (!(searchTerm.isEmpty())) ? contractRepository.getAllContractsBySearchParam(searchTerm).stream().findFirst().get() : com.softserve.osbb.service.impl.ContractServiceImpl.EMPTY_REPORT;
}