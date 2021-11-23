@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        if (libString.IsNullOrEmpty(vok.getFileName())) {
            SaveVokAs(true, false);
        }else {
            vok.SaveFile(vok.getFileName(), vok.getUniCode(), false);
            vok.aend = false;
            _backPressed += 1;
            handlerbackpressed.postDelayed(rSetBackPressedFalse, 10000);
            saveFilePrefs(false);
        }
    } catch (java.lang.Exception e) {
        lib.ShowException(this, e);
    }
}