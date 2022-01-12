@java.lang.Override
public void onResponse(retrofit2.Response<com.desk.java.apiclient.model.Case> response) {
    callback.onCaseCreated(response.body());
}