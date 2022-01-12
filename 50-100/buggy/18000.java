public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String hours = "test_value_hours_onClick()";
    if (which == 0) {
        android.content.Intent intent = new android.content.Intent(this, naveen16.wheredeyatdoe.BuildingDetailsActivity.class);
        intent.putExtra("NAME", "test_value_name_onClick()0");
        intent.putExtra("HOURS", hours);
        startActivity(intent);
    }
    if (which == 1) {
        android.content.Intent intent = new android.content.Intent(this, naveen16.wheredeyatdoe.ReportActivity.class);
        intent.putExtra("NAME", "test_value_name_onClick()1");
        startActivity(intent);
    }
}