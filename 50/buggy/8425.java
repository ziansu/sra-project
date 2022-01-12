@java.lang.Override
public com.sasd13.proadmin.android.service.ServiceResult<java.lang.Void> logOut() {
    sessionStorageService.clear();
    userStorageService.clear();
    return new com.sasd13.proadmin.android.service.ServiceResult(true, 200);
}