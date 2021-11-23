public void removeSelection(int pos) {
    android.view.View view = manager.findViewByPosition(pos);
    android.widget.TextView title = ((android.widget.TextView) (view.findViewById(R.id.aa_title)));
    android.widget.TextView subtitle = ((android.widget.TextView) (view.findViewById(R.id.subtitle)));
    title.setTextColor(Color.WHITE);
    subtitle.setTextColor(android.support.v4.content.ContextCompat.getColor(getContext(), android.R.color.darker_gray));
}