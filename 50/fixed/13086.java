public void run() {
    android.util.Log.i(net.hokiegeek.android.dondeestas.data.Model.TAG, "Executor retrieving Following");
    synchronized(user) {
        new net.hokiegeek.android.dondeestas.data.Model.GetFollowingTask().execute(user.getFollowing());
    }
}