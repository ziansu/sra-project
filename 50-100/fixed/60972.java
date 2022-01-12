private com.homesky.homecloud_lib.model.response.ConflictingRuleResponse callCRR(com.homesky.homecloud_lib.HomecloudWrapper.FunctionCommand command) throws com.homesky.homecloud_lib.exceptions.NetworkException {
    com.homesky.homecloud_lib.model.response.SimpleResponse sr = callFunctionCommand(command);
    if (sr == null)
        return null;
    else
        if (sr instanceof com.homesky.homecloud_lib.model.response.ConflictingRuleResponse)
            return ((com.homesky.homecloud_lib.model.response.ConflictingRuleResponse) (sr));
        else
            return new com.homesky.homecloud_lib.model.response.ConflictingRuleResponse(sr.getStatus(), sr.getErrorMessage(), null);
        
    
}