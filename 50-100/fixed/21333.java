@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((((object.currentUserOwed) > 0) || ((object.friendOwed) > 0)) || (object.isPendingStatement)) {
        android.widget.Toast.makeText(parent, "You can't delete friend with non-zero balance/ pending statement!", Toast.LENGTH_LONG).show();
    }else {
        object.deleteFriend(parent, ("You denied the friend request from " + (object.getRealName())), null);
    }
}