@java.lang.Override
public void onClick(android.view.View v) {
    if (((mWifiManger.getConnectionInfo().getSSID().length()) > 7) && (mWifiManger.getConnectionInfo().getSSID().substring(1, 7).equals("iBadge"))) {
        replaceActivity(this, com.antonioleiva.sunmoonstar.Configure_Device_WANActivity.class);
    }else {
        android.widget.Toast.makeText(this, "Please choose iBadgeDemoAP_xx-xx-xx-xx-x…", Toast.LENGTH_LONG).show();
    }
}