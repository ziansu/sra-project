@java.lang.Override
public void onAnimationEnd() {
    android.content.Intent intent = new android.content.Intent(this, com.tedkim.smartschedule.regist.RegistActivity.class);
    if ((mCurrentFragment) == (FRAG_SCHEDULE)) {
        getTime();
    }
    android.util.Log.d("CHECK_DATE", ("Before Register >>>>>>>>>>>>>>>" + (mDate)));
    intent.putExtra("DATE", mDate);
    startActivity(intent);
}