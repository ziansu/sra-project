@java.lang.Override
public void onCompleted(sep.software.anicare.model.AniCareUser entity) {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(mThisActivity, sep.software.anicare.activity.PetSettingActivity.class);
    startActivity(intent);
    finish();
    mAppContext.dismissProgressDialog();
}