private void setLongPressListener(android.view.View v, android.view.View popup) {
    v.setOnLongClickListener(new android.view.View.OnLongClickListener() {
        @butterknife.InjectView(value = R.id.repos_button)
        android.widget.ImageView reposButton;

        @butterknife.InjectView(value = R.id.bold_button)
        android.widget.ImageView boldButton;

        @butterknife.InjectView(value = R.id.important_button)
        android.widget.ImageView importantButton;

        @butterknife.InjectView(value = R.id.edit_button)
        android.widget.ImageView editButton;

        @butterknife.InjectView(value = R.id.delete_button)
        android.widget.ImageView deleteButton;

        @java.lang.Override
        public boolean onLongClick(android.view.View v) {
            if ((v.getParent()) instanceof com.ameron32.apps.tapnotes.v2.ui.mc_notes.NotesRecycler) {
                com.ameron32.apps.tapnotes.v2.ui.mc_notes.NotesRecycler nr = ((com.ameron32.apps.tapnotes.v2.ui.mc_notes.NotesRecycler) (v.getParent()));
                nr.itemClicked(v);
                popup.setVisibility(View.VISIBLE);
            }
            return false;
        }
    });
}