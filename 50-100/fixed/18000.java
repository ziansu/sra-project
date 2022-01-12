public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String hours = "test_value_hours_onClick()";
    if (which == 0) {
        android.content.Intent intent = new android.content.Intent(this, naveen16.wheredeyatdoe.BuildingDetailsActivity.class);
        intent.putExtra("NAME", name);
        intent.putExtra("HOURS", hours);
        startActivity(intent);
    }
    if (which == 1) {
        android.content.Intent intent = new android.content.Intent(this, naveen16.wheredeyatdoe.ReportActivity.class);
        intent.putExtra("NAME", name);
        startActivity(intent);
    }
}