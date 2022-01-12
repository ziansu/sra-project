@java.lang.Override
public void openShareDialog(@android.support.annotation.NonNull
java.lang.String text) {
    android.content.Context context = com.tomaschlapek.tcbasearchitecture.presentation.ui.activity.base.PresenterActivity.getApplicationContext();
    android.content.Intent shareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    shareIntent.setType("text/plain");
    shareIntent.putExtra(Intent.EXTRA_TITLE, context.getString(R.string.lib_app_name));
    shareIntent.putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.lib_app_name));
    shareIntent.putExtra(Intent.EXTRA_TEXT, text);
    context.startActivity(android.content.Intent.createChooser(shareIntent, null));
}