@java.lang.Override
public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
    view = getLayoutInflater().inflate(R.layout.gridview_item, viewGroup);
    android.widget.TextView tvText = ((android.widget.TextView) (view.findViewById(R.id.tvText)));
    android.widget.TextView tvTitle = ((android.widget.TextView) (view.findViewById(R.id.tvTitle)));
    com.example.user1.notes_taking.Note tempNote = notes.get(i);
    tvText.setText(tempNote.getText());
    tvTitle.setText(tempNote.getTitle());
    return view;
}