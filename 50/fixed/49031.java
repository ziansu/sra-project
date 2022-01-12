public void generateZip(java.util.ArrayList<com.amaze.filemanager.ui.ZipObjectParcelable> arrayList) {
    offset = 0;
    stoppedAnimation = false;
    enterZip = arrayList;
    notifyDataSetChanged();
    itemsChecked = new boolean[enterZip.size()];
}