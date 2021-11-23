@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent intent1 = new android.content.Intent(context, com.example.kali.weathy.WeatherActivity.class);
    intent1.putExtra("refresh", "refresh");
    startActivity(intent1);
    finish();
}