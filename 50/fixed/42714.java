@java.lang.Override
public android.content.Intent getParentActivityIntent() {
    android.content.Intent newIntent = null;
    newIntent = new android.content.Intent(this, getIntent().getClass());
    return newIntent;
}