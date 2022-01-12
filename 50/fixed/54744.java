@android.support.annotation.NonNull
protected android.content.Intent buildUserParcelIntent(java.lang.Class expliciteClass, android.os.Parcelable parcelable) {
    android.content.Intent intent = jumpup.imi.fb4.htw.de.jumpupandroid.util.activity.JumpUpActivity.getExpliciteIntent(this, expliciteClass);
    putExtraUserParcelable(parcelable, intent);
    return intent;
}