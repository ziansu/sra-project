@java.lang.Override
public void onBackPressed() {
    org.wycliffeassociates.translationrecorder.Reporting.Logger.w(this.toString(), "Back was pressed.");
    if ((mode) == (org.wycliffeassociates.translationrecorder.Playback.PlaybackActivity.MODE.VERSE_MARKER)) {
        onDisableVerseMarkerMode();
    }else
        if (actionsToSave()) {
            org.wycliffeassociates.translationrecorder.Reporting.Logger.i(this.toString(), "Asking if user wants to save before going back");
            org.wycliffeassociates.translationrecorder.FilesPage.ExitDialog exit = org.wycliffeassociates.translationrecorder.FilesPage.ExitDialog.Build(this, R.style.Theme_AppCompat_Light_Dialog, false, isPlaying, mWavFile.getFile());
            exit.show();
        }else {
            super.onBackPressed();
        }
    
}