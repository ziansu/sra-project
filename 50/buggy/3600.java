@java.lang.Override
public boolean updatePerson(net.hokiegeek.android.dondeestas.data.Person p) {
    android.util.Log.v(net.hokiegeek.android.dondeestas.datasource.DbSource.TAG, "updatePerson()");
    org.json.JSONObject resp = this.req(net.hokiegeek.android.dondeestas.datasource.DbSource.PATH_UPDATE_LOCATION, net.hokiegeek.android.dondeestas.Util.PersonToJson(p));
    return false;
}