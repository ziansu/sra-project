@java.lang.Override
public void onSuccess(@android.support.annotation.NonNull
com.google.android.gms.plus.People.LoadPeopleResult loadPeopleResult) {
    android.widget.Toast.makeText(activity, "", Toast.LENGTH_SHORT).show();
    com.google.android.gms.plus.model.people.Person person = loadPeopleResult.getPersonBuffer().get(0);
    android.util.Log.d("fasfafasfsafasfas", ("onSuccess: " + person));
}