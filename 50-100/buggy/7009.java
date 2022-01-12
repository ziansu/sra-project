@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent i = new android.content.Intent(getActivity(), com.mintminter.simpletwitter.activity.ComposeActivity.class);
    if ((mUser) != null) {
        i.putExtra(Util.EXTRA_USER, org.parceler.Parcels.wrap(mUser));
    }
    startActivityForResult(i, Util.REQUESTCODE_COMPOSE);
}