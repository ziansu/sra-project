@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.ContentValues valuesToInsert = new android.content.ContentValues();
    valuesToInsert.put("measuredAt", ((android.widget.EditText) (promptView.findViewById(R.id.datetime))).getText().toString());
    valuesToInsert.put("glucoseValue", ((android.widget.EditText) (promptView.findViewById(R.id.measurement))).getText().toString());
    db.insert("BloodGlucose", null, valuesToInsert);
    dialog.dismiss();
}