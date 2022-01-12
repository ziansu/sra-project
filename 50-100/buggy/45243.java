@java.lang.Override
public void onClick(android.view.View view) {
    if ((mLocation) != null) {
        android.content.Intent sharingIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_TEXT, mLocation);
        startActivity(android.content.Intent.createChooser(sharingIntent, getString(R.string.share)));
    }else {
        Warning(new com.afollestad.materialdialogs.MaterialDialog.ButtonCallback() {
            @java.lang.Override
            public void onPositive(com.afollestad.materialdialogs.MaterialDialog dialog) {
                super.onPositive(dialog);
            }
        });
    }
}