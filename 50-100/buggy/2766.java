public void addItemAtPosition(int position, java.lang.String item) {
    myDataset.add(position, item);
    mAdapter.notifyItemInserted(position);
    com.vsgh.pronounceit.persistence.Sounds sounds = new com.vsgh.pronounceit.persistence.Sounds(item, false);
    sounds.save();
    com.vsgh.pronounceit.apihelpers.forvo.ForvoApi.downloadMp3Url(this, sounds.getName());
}