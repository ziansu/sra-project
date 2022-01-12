public void updateRecyclerAdapter(com.ringsterz.androidtextreader.db.DBHelper.PhraseCursor phraseCursor) {
    java.util.ArrayList<com.ringsterz.androidtextreader.model.Phrase> phrases = com.ringsterz.androidtextreader.util.CursorToListUtil.getPhraseList(phraseCursor);
    recyclerAdapter = new com.ringsterz.androidtextreader.adapter.RecyclerViewAdapter(this, phrases);
    recyclerView.setAdapter(recyclerAdapter);
}