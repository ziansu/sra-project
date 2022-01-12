@java.lang.Override
protected void onResume() {
    super.onResume();
    org.ei.opensrp.view.customControls.CustomFontTextView submittedBy = ((org.ei.opensrp.view.customControls.CustomFontTextView) (findViewById(R.id.submitted_by)));
    if (!(android.text.TextUtils.isEmpty(this.subTitle))) {
        submittedBy.setVisibility(View.VISIBLE);
        submittedBy.setText(java.lang.String.format(getString(R.string.submitted_by_), this.subTitle));
    }else {
        submittedBy.setVisibility(View.GONE);
    }
    refreshIndicatorViews();
}