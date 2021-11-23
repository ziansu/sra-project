@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialogContent.cancelGetFix();
    if (dialogContent.saveSettings(myParent)) {
        com.forrestguice.suntimeswidget.LocationConfigView.LocationViewMode mode = dialogContent.getMode();
        switch (mode) {
            case MODE_CUSTOM_ADD :
            case MODE_CUSTOM_EDIT :
                dialogContent.setMode(LocationConfigView.LocationViewMode.MODE_CUSTOM_SELECT);
                dialogContent.populateLocationList();
                break;
        }
        dialog.dismiss();
        if ((onAccepted) != null) {
            onAccepted.onClick(dialog, 0);
        }
    }
}