public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if ((b) != null) {
        textView = ((android.widget.TextView) (rootView.findViewById(R.id.textView)));
        java.lang.String textV = b.getString("textViewText");
        textView.setText(textV);
    }
}