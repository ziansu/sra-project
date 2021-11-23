@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int item) {
    switch (item) {
        case 0 :
            languageCode = "Sv";
            break;
        case 1 :
            languageCode = "En";
            break;
        case 2 :
            languageCode = "Fa";
            break;
        case 3 :
            languageCode = "Ar";
            break;
    }
    setConfigLanguage(languageCode);
    updateActivity();
    levelDialog.dismiss();
}