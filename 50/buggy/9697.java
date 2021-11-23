public void stopLoading() {
    progress.dismiss();
    progress = null;
    org.wildstang.wildrank.android.data.DataManager.prepareForEject();
    startActivity(new android.content.Intent(android.provider.Settings.ACTION_INTERNAL_STORAGE_SETTINGS));
    android.widget.Toast.makeText(getActivity(), "Scroll down, press \"Unmount\", press back button.", Toast.LENGTH_LONG).show();
}