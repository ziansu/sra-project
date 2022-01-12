@java.lang.Override
public void onBackPressed() {
    if (!(backgroundPrefValue.equals(pref_background.getValue()))) {
        finishAffinity();
        startActivity(new android.content.Intent(this, com.johnsimon.payback.ui.FeedActivity.class));
    }else {
        super.onBackPressed();
    }
}