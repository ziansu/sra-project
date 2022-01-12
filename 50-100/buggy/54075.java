public static fi.bitrite.android.ws.activity.model.HostInformation fromIntent(android.content.Intent i, fi.bitrite.android.ws.persistence.StarredHostDao dao) {
    final fi.bitrite.android.ws.model.Host host = ((fi.bitrite.android.ws.model.Host) (i.getParcelableExtra("host")));
    final int id = i.getIntExtra("id", fi.bitrite.android.ws.activity.model.HostInformation.NO_ID);
    final java.util.ArrayList<fi.bitrite.android.ws.model.Feedback> feedback = i.getParcelableArrayListExtra("feedback");
    final boolean starred = dao.isHostStarred(id, host.getName());
    return new fi.bitrite.android.ws.activity.model.HostInformation(host, feedback, id, starred);
}