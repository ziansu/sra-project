public void getUserDetailsFromFB() {
    new com.example.events.PullDataFromFacebook(cameToThisActivityFrom, this).getDataFromFacebook();
    if (!(com.example.FundigoApp.GlobalVariables.IS_CUSTOMER_REGISTERED_USER))
        PassSMSRegistration();
    
}