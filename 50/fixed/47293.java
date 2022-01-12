@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            save(dialog, false);
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            transmissionTab.addNew(null);
            break;
    }
}