@java.lang.Override
public com.devbrackets.android.recyclerextdemo.ui.viewholder.SimpleTextViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = inflater.inflate(R.layout.simple_text_item, parent, false);
    return new com.devbrackets.android.recyclerextdemo.ui.viewholder.SimpleTextViewHolder(view);
}