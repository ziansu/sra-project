@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String myoGesture = intent.getStringExtra("gesture");
    android.util.Log.i(com.example.drdc_admin.moverioapp.activities.StepListActivity.TAG, ("position = " + (com.example.drdc_admin.moverioapp.activities.StepListActivity.listPosition)));
    handleGesture(context, myoGesture);
    listview.setAdapter(adapter);
}