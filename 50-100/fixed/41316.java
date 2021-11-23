@java.lang.Override
public void onClick(android.view.View v) {
    amazingme.model.Parent parent = getUserContext().getParent();
    parent.setFirstName(firstName.getText().toString());
    parent.setLastName(lastName.getText().toString());
    getAppContext().saveUserContext();
    goTo(EnumeratedActivity.PCP_INFORMATION);
}