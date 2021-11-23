private void saveCurNote() {
    java.lang.String str = mEtFastNote.toHtml();
    str = str.replace("<del>", "<strike>");
    str = str.replace("</del>", "</strike>");
    timber.log.Timber.e(str);
    ssthouse.love.xinying.note.FastNoteConfigUtil.getInstance(this).saveNote(str);
    android.content.Intent intent = new android.content.Intent(this, ssthouse.love.xinying.note.FastNoteProvider.class);
    intent.setAction(Constant.ACTION_NOTE_UPDATE);
    sendBroadcast(intent);
    if (isNoteChanged)
        mPresenter.uploadFastNote();
    
}