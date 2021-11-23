private void addTitle(java.lang.String title) {
    android.view.View view = android.view.LayoutInflater.from(getActivity()).inflate(R.layout.item_title, null);
    android.widget.TextView textView = ((android.widget.TextView) (view.findViewById(R.id.title_text)));
    textView.setText(title);
    if ((container) != null)
        container.addView(view);
    
}