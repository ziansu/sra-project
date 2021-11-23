private android.widget.Button initSubmitButton() {
    android.widget.Button submit = new android.widget.Button(getActivity());
    submit.setLayoutParams(new android.widget.LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT, android.widget.LinearLayout.LayoutParams.WRAP_CONTENT));
    submit.setText(getText(R.string.submit));
    submit.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            submit();
        }
    });
    return submit;
}