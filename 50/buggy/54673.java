@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    inflater.inflate(R.menu.card_template_editor, menu);
    if (isStandardModel()) {
        menu.findItem(R.id.action_delete).setVisible(false);
    }
    super.onCreateOptionsMenu(menu, inflater);
}