@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            helper.deleteSchedule(db, actName, hour, day, month, year);
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            break;
    }
}