@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.search :
            android.content.Intent intent = new android.content.Intent(this, com.example.samsung.weather.activity.lookUp_weather.class);
            intent.putExtra("is_from_weather", true);
            startActivity(intent);
            break;
        default :
            break;
    }
}