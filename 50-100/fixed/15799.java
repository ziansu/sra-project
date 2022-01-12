public void onClick(android.content.DialogInterface dialog, int item) {
    switch (item) {
        case 0 :
            setLocale("en");
            break;
        case 1 :
            setLocale("sv");
            break;
        default :
            setLocale("fi");
            break;
    }
    levelDialog.dismiss();
}