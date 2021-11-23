@java.lang.Override
public void onClick(android.view.View v) {
    ambiesoft.start.model.utility.SoftKeyboard.hideSoftKeyboard(this);
    skipSignIn();
    finish();
}