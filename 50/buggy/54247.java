@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    reminderCreator.createReminder(location, name, dialogInputString);
    dialogInputString = "";
}