@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    if ((position == 0) || (position == 1)) {
        android.content.Intent intent = new android.content.Intent(this, com.wkiro.activities.TransformPickerActivity.class);
        intent.putExtra("activityType", position);
        intent.putExtra("transform_strategy", "Negative");
        startActivity(intent);
    }else
        if (position == 3) {
            java.lang.System.exit(0);
        }else {
            showAboutUs();
        }
    
}