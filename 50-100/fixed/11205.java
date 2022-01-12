@java.lang.Override
public void onClick(android.view.View itemView) {
    android.content.Intent i = new android.content.Intent(itemView.getContext(), com.pratikm.PatientTracker.HealthDetailsActivity.class);
    i.putExtra("clickedPatientEmail", mTextViewPatientEmail.getText().toString());
    itemView.getContext().startActivity(i);
}