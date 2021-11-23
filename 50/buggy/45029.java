@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    int index = ((java.lang.Integer) (getView().getTag()));
    removeContact(index);
}