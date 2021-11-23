public void onClick(android.content.DialogInterface dialog, int whichButton) {
    player.setName(editView.getText().toString());
    player.setDropped(cb.isChecked());
    if (cb.isChecked()) {
        ((com.nag.android.bs_match_maker.AppCore) (getActivity())).updateMatch();
    }
    listview.getAdapter().getView(position, view, listview);
}