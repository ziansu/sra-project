@java.lang.Override
public void onReceived(com.stxnext.intranet2.backend.model.team.Team team) {
    long[] userIdsLong = team.getUsers();
    userIds = new java.util.ArrayList<java.lang.Long>(com.google.common.primitives.Longs.asList(userIdsLong));
    getUsers(userIds);
}