public void removeItemAtPosition(int position) {
    mItems.remove(position);
    metadataToVal.remove(position);
    com.pixieproto.bluephish.pixieproto.ContextList.me.populateList(position);
}