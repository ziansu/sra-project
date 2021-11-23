private void initMediaAdapter() {
    mMediaAdapter = new net.opendasharchive.openarchive.db.MediaAdapter(this.getActivity(), R.layout.activity_media_list_row, net.opendasharchive.openarchive.db.Media.getAllMediaAsList());
    setListAdapter(mMediaAdapter);
}