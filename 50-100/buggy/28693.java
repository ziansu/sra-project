@android.support.annotation.Nullable
@java.lang.Override
public android.content.Intent getParentActivityIntent() {
    try {
        android.content.Intent intent = new android.content.Intent(this, java.lang.Class.forName(mParentActivity));
        intent.putExtra("appont", mAppont);
        intent.putExtra("feedback", mFeedback);
        intent.putParcelableArrayListExtra("inbox", mInbox);
        intent.putExtra("rxItem", getIntent().getParcelableExtra("rxItem"));
        return intent;
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
    return super.getParentActivityIntent();
}