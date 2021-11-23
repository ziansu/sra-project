public void run() {
    android.util.Log.v(net.hokiegeek.android.dondeestas.data.Model.TAG, "Executor retrieving Following");
    new net.hokiegeek.android.dondeestas.data.Model.GetFollowingTask().execute(user.getFollowing());
}