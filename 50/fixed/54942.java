@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String task = java.lang.String.valueOf(DialogText.getText());
    if ((task.length()) > 0)
        addEntry(task);
    
}