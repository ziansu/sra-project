private com.homesky.homecloud_lib.model.response.UserDataResponse callUDR(com.homesky.homecloud_lib.HomecloudWrapper.FunctionCommand command) throws com.homesky.homecloud_lib.exceptions.NetworkException {
    com.homesky.homecloud_lib.model.response.SimpleResponse sr = callFunctionCommand(command);
    if (sr == null)
        return null;
    else
        if (sr instanceof com.homesky.homecloud_lib.model.response.UserDataResponse)
            return ((com.homesky.homecloud_lib.model.response.UserDataResponse) (sr));
        else
            return new com.homesky.homecloud_lib.model.response.UserDataResponse(sr.getStatus(), sr.getErrorMessage(), new java.util.ArrayList<java.lang.String>());
        
    
}