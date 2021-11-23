@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    switch (requestCode) {
        case com.matburt.mobileorg.Gui.OutlineActivity.RUNFOR_EXPAND :
            if (resultCode != (com.matburt.mobileorg.Gui.OutlineActivity.RESULT_DONTPOP))
                this.appInst.popNodestack();
            
            break;
        case com.matburt.mobileorg.Gui.OutlineActivity.RUNFOR_EDITNODE :
            break;
        case com.matburt.mobileorg.Gui.OutlineActivity.RUNFOR_NEWNODE :
            if (resultCode == (RESULT_OK)) {
                this.appInst.invalidateFile(OrgFile.CAPTURE_FILE);
                this.refreshDisplay();
            }
            break;
    }
}