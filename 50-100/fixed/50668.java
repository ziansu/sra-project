@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    android.support.v4.app.DialogFragment userEditDialog = new org.bohverkill.pointsundercover.dialog.UserEdit();
    android.os.Bundle args = new android.os.Bundle();
    args.putInt("position", position);
    userEditDialog.setArguments(args);
    userEditDialog.show(getSupportFragmentManager(), "UserEdit");
}