@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            serversAdapter.removeItem(position);
            server.delete();
            break;
    }
}