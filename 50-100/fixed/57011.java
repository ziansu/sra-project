private android.widget.Button initSubmitButton() {
    android.widget.Button submit = new android.widget.Button(getActivity());
    submit.setText(getText(R.string.submit));
    submit.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            submit();
        }
    });
    return submit;
}