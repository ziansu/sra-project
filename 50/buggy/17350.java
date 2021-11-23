@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int choice) {
    switch (choice) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            itemPhoto.setImageResource(R.drawable.photo_placeholder);
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            break;
    }
}