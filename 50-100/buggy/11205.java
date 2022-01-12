@java.lang.Override
public void onClick(android.view.View itemView) {
    android.util.Log.d(android.content.ContentValues.TAG, "onClick ");
    android.widget.Toast clickMessage = android.widget.Toast.makeText(itemView.getContext(), "CLICKED!", Toast.LENGTH_LONG);
    clickMessage.show();
    android.content.Intent i = new android.content.Intent(itemView.getContext(), com.pratikm.PatientTracker.HealthDetailsActivity.class);
    i.putExtra("clickedPatientEmail", mTextViewPatientEmail.getText().toString());
    itemView.getContext().startActivity(i);
}