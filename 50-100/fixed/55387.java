public void onClick(android.content.DialogInterface dialog, int clicked) {
    switch (clicked) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            for (int i = 0; i < (_options.length); i++) {
                if (_selections[i]) {
                    addPilot(mArrPilots.get(i));
                }
            }
            updateListView();
            mDlg = null;
            break;
    }
}