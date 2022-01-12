public void onBackStackChanged() {
    if (!(approvalWarned)) {
        android.widget.RelativeLayout container = ((android.widget.RelativeLayout) (findViewById(R.id.approvalLay)));
        android.widget.RelativeLayout.LayoutParams parameters = new android.widget.RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        android.widget.TextView warning = new android.widget.TextView(container.getContext());
        warning.setText("You cannot disapprove after approving!");
        parameters.addRule(RelativeLayout.BELOW, R.id.approvalText);
        container.addView(warning, parameters);
        approvalWarned = true;
    }else {
        approvalWarned = false;
    }
}