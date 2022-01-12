@java.lang.Override
public void onClick(android.view.View v) {
    questions.remove(position);
    notifyDataSetChanged();
}