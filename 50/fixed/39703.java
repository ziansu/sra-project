@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            removeOverlayFromMap(this);
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            break;
        default :
            break;
    }
}