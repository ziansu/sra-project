@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((getActivity()) == null) {
        return ;
    }
    startActivity(new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
}