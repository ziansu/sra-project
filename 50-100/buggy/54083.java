@java.lang.Override
public void onResponse(retrofit2.Call<be.fenego.android_spotshop.models.Customer> call, retrofit2.Response<be.fenego.android_spotshop.models.Customer> response) {
    if (response.isSuccessful()) {
        java.lang.System.out.println("Updated password");
        be.fenego.android_spotshop.utilities.LoginUtility.storeUserCredentials(be.fenego.android_spotshop.utilities.LoginUtility.retrieveUsername(), password.getPassword());
        callback.onSuccess();
    }else {
        java.lang.System.out.println(response.errorBody().toString());
        java.lang.System.out.println(response.code());
        java.lang.System.out.println(response.raw().toString());
        callback.onError();
    }
}