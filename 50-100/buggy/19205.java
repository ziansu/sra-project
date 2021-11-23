@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.search :
            android.content.Intent ser = new android.content.Intent(this, com.example.samsung.weather.activity.lookUp_weather.class);
            ser.putExtra("is_from_weather", true);
            startActivity(ser);
            break;
        default :
            break;
    }
}