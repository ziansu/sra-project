@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            android.widget.Toast.makeText(getActivity(), R.string.alert_delete_confirmed, Toast.LENGTH_SHORT).show();
            oth_regensburg.automaticnewspaperdownloader.MainActivity.deleteFile();
            oth_regensburg.automaticnewspaperdownloader.ListviewFragment.arrayListeFiles = oth_regensburg.automaticnewspaperdownloader.MainActivity.scanSdCardFolder();
            oth_regensburg.automaticnewspaperdownloader.ListviewFragment.refreshView(oth_regensburg.automaticnewspaperdownloader.ListviewFragment.arrayListeFiles, getActivity());
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            android.widget.Toast.makeText(getActivity(), R.string.alert_delete_aborted, Toast.LENGTH_SHORT).show();
            break;
    }
}