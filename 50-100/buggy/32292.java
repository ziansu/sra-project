private java.util.Set<org.seekay.contract.model.domain.Contract> matchByHeaders(org.seekay.contract.model.domain.ContractRequest contractRequest) {
    java.util.Set<org.seekay.contract.model.domain.Contract> matches = headerMatcher.isMatch(contractService.readEnabled(), contractRequest.getHeaders());
    log.debug("Matched by headers : {} ", org.seekay.contract.model.tools.PrintTools.prettyPrint(matches, objectMapper));
    return matches;
}