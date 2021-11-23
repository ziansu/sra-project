public static fi.bitrite.android.ws.activity.model.HostInformation fromSavedInstanceState(android.os.Bundle savedInstanceState, fi.bitrite.android.ws.persistence.StarredHostDao dao) {
    final fi.bitrite.android.ws.model.Host host = savedInstanceState.getParcelable("host");
    final java.util.ArrayList<fi.bitrite.android.ws.model.Feedback> feedback = savedInstanceState.getParcelableArrayList("feedback");
    final int id = savedInstanceState.getInt("id");
    final boolean starred = dao.isHostStarred(id);
    return new fi.bitrite.android.ws.activity.model.HostInformation(host, feedback, id, starred);
}