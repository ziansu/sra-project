public void handleResponse(com.backendless.BackendlessUser user) {
    if (user.getProperty("type").equals("student"))
        mLoginPresenter.onSuccessStudent();
    else
        if (user.getProperty("type").equals("prof"))
            mLoginPresenter.onSuccessProf();
        
    
}