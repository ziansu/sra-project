private void setView() {
    if (isStarred) {
        clips = db.getStarredClipHistory(queryText);
    }else {
        clips = db.getClipHistory(queryText);
    }
    clipCardAdapter = new com.catchingnow.tinyclipboardmanager.ActivityMain.ClipCardAdapter(clips, this);
    mRecList.setAdapter(clipCardAdapter);
    setItemsVisibility();
}