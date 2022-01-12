@java.lang.Override
public void openDetail(com.mintminter.simpletwitter.model.Tweet tweet) {
    android.content.Intent i = new android.content.Intent(getActivity(), com.mintminter.simpletwitter.activity.DetailActivity.class);
    i.putExtra(Util.EXTRA_TWEET, org.parceler.Parcels.wrap(tweet));
    i.putExtra(Util.EXTRA_USER, org.parceler.Parcels.wrap(mUser));
    getActivity().startActivity(i);
}