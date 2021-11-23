private void setBackButton() {
    android.widget.Button button = ((android.widget.Button) (getActivity().findViewById(R.id.button_1)));
    button.setText("Close");
    button.setOnClickListener(new android.view.View.OnClickListener() {
        public void onClick(android.view.View v) {
            getActivity().finish();
        }
    });
}