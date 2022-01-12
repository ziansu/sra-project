@java.lang.Override
public void onChildChanged(com.firebase.ui.database.EventType type, com.google.firebase.database.DataSnapshot snapshot, int index, int oldIndex) {
    switch (type) {
        case ADDED :
            onKeyAdded(snapshot, index);
            break;
        case MOVED :
            onKeyMoved(snapshot, index, oldIndex);
            break;
        case CHANGED :
            break;
        case REMOVED :
            onKeyRemoved(snapshot, index);
            break;
    }
}