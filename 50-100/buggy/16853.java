@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.mochginanjarbusiri.busiri_map.SubmitActivity.class);
    startActivity(intent);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putDouble("longitude", longitude);
    bundle.putDouble("latitude", latitude);
    bundle.putString("token", token);
    intent.putExtras(bundle);
    startActivityForResult(intent, com.example.mochginanjarbusiri.busiri_map.MapsActivity.SUBMIT_REQUEST_CODE);
}