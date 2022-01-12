public void onClick(android.content.DialogInterface dialog, int item) {
    switch (item) {
        case 0 :
            setLocale("en");
            break;
        case 1 :
            setLocale("sv");
            break;
        case 2 :
            setLocale("fi");
            break;
    }
    levelDialog.dismiss();
}