@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            treehou.se.habit.core.Server server = serversAdapter.getItem(position);
            serversAdapter.removeItem(position);
            server.delete();
            break;
    }
}