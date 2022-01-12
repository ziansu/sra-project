public void addInfoItemList(java.util.List<org.schabi.newpipe.extractor.InfoItem> data) {
    if (data != null) {
        infoItemList.addAll(data);
        notifyDataSetChanged();
    }
}