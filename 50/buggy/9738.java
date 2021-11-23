public static void saveContent(java.lang.String text) {
    if (me.shreyasr.quicknote.notepad.NotepadUtils.hasCurrentNote())
        me.shreyasr.quicknote.notepad.NotepadUtils.prefs.edit().putString(me.shreyasr.quicknote.notepad.NotepadUtils.getCurrentNoteTitle(), text).apply();
    else
        me.shreyasr.quicknote.notepad.NotepadUtils.setCurrentNote("default");
    
}