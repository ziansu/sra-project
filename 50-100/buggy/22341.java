public org.seekay.contract.model.domain.Contract expandForContract(org.seekay.contract.model.domain.Contract sourceContract, java.util.Map<java.lang.String, java.lang.Object> parameterMap) {
    org.seekay.contract.model.domain.Contract destinationContract = new org.seekay.contract.model.domain.Contract();
    expandSetupBlock(sourceContract, parameterMap, destinationContract);
    org.seekay.contract.model.domain.ContractRequest destinationRequest = expandForContractRequest(sourceContract.getRequest(), parameterMap);
    org.seekay.contract.model.domain.ContractResponse destinationResponse = expandForContractResponse(sourceContract.getResponse(), parameterMap);
    destinationContract.setRequest(destinationRequest);
    destinationContract.setResponse(destinationResponse);
    return destinationContract;
}