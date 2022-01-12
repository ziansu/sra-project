@java.lang.Override
public void onClick(android.view.View view) {
    ((dragon.tamu.playphrase.EditActivity) (getActivity())).addPhrase(pName, cName, lName, fPath);
    onResume();
    android.support.design.widget.Snackbar snackbar1 = android.support.design.widget.Snackbar.make(view, "Saved!", Snackbar.LENGTH_SHORT);
    snackbar1.show();
}