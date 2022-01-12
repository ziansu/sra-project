@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    try {
        java.util.List<nl.tue.the30daychallenge.data.RemoteChallenge> challenges = nl.tue.the30daychallenge.data.RemoteConnector.getChallenges(new nl.tue.the30daychallenge.data.RemoteConnector.SortFilter(RemoteConnector.SortField.RANDOM));
        android.util.Log.d("Shaker", challenges.get(0).toString());
        nl.tue.the30daychallenge.details.DetailsActivity.setChallenge(challenges.get(0));
        me.startActivity(new android.content.Intent(me.getActivity(), nl.tue.the30daychallenge.details.DetailsActivity.class));
    } catch (nl.tue.the30daychallenge.exception.NoServerConnectionException e) {
        e.printStackTrace();
    }
    return "";
}