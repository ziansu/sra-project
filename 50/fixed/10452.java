@java.lang.Override
public void onClick(android.view.View v) {
    int id = v.getId();
    if (id == (R.id.assistant_check)) {
        checkAccount.setEnabled(false);
        accountCreator.isAccountActivated();
    }
}