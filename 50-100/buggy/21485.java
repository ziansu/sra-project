@java.lang.Override
public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
    android.view.LayoutInflater inflater = ((android.view.LayoutInflater) (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    if (view == null) {
        view = inflater.inflate(R.layout.message_layout, viewGroup, false);
    }
    android.widget.TextView messageTextView = view.findViewById(R.id.messageTextView);
    messageTextView.setText(messages.get(i));
    return view;
}