@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    currentlyEditing = null;
    editingPosition = -1;
    doUnHighlighted(holder, comment, baseNode, true);
}