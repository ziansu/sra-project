@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = null;
    pref = getSharedPreferences(getPackageName(), 0);
    edit = pref.edit();
    edit.putBoolean(Utils.PREF_AUTOLOGIN, false);
    edit.commit();
    stopService(new android.content.Intent(this, kr.waytech.attendancecheck_beacon.service.BeaconService.class));
    intent = new android.content.Intent(this, kr.waytech.attendancecheck_beacon.activity.LoginActivity.class);
    android.widget.Toast.makeText(this, "로그아웃 되었습니다.", Toast.LENGTH_SHORT).show();
    startActivity(intent);
    finish();
}