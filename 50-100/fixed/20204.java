protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (requestCode) {
        case com.mooshim.mooshimeter.main.DeviceActivity.PREF_ACT_REQ :
            android.widget.Toast.makeText(this, "Applying preferences", Toast.LENGTH_SHORT).show();
            break;
        case com.mooshim.mooshimeter.main.DeviceActivity.FWUPDATE_ACT_REQ :
            break;
        case com.mooshim.mooshimeter.main.DeviceActivity.TREND_ACT_REQ :
            android.widget.Toast.makeText(this, "Trend finished", Toast.LENGTH_SHORT).show();
            trend_view_running = false;
            break;
        default :
            setError("Unknown request code");
            break;
    }
}