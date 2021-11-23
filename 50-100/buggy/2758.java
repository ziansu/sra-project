@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.widget.Toast.makeText(activity, "", Toast.LENGTH_SHORT).show();
    Plus.PeopleApi.loadVisible(mGoogleApiClient, "me").setResultCallback(new com.google.android.gms.common.api.ResultCallbacks<com.google.android.gms.plus.People.LoadPeopleResult>() {
        @java.lang.Override
        public void onSuccess(@android.support.annotation.NonNull
        com.google.android.gms.plus.People.LoadPeopleResult loadPeopleResult) {
            com.google.android.gms.plus.model.people.Person person = loadPeopleResult.getPersonBuffer().get(0);
            android.util.Log.d("fasfafasfsafasfas", ("onSuccess: " + person));
        }

        @java.lang.Override
        public void onFailure(@android.support.annotation.NonNull
        com.google.android.gms.common.api.Status status) {
        }
    });
}