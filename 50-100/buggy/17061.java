@java.lang.Override
public void onClick(android.view.View view) {
    mantraText = edt.getText().toString();
    refreshViewData();
    dialogView.findViewById(R.id.dialogbuttonlayout).setVisibility(View.GONE);
    edt.setVisibility(View.GONE);
    new mojap108.mojap.FeedbackRequest(this, mHandler).sendFeedback(edt.getText().toString());
    thankYouText.setVisibility(View.VISIBLE);
    dismissButton.setVisibility(View.VISIBLE);
}