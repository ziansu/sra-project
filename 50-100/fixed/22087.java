@java.lang.Override
public void onClick(android.view.View v) {
    enginek.dreamspace.Dream dream = new enginek.dreamspace.Dream();
    dream.setId(args.getInt("id"));
    db.deleteDream(dream);
    dialog.dismiss();
    getFragmentManager().popBackStack();
}