public void addInfoItemList(java.util.List<org.schabi.newpipe.extractor.InfoItem> videos) {
    if (videos != null) {
        infoItemList.addAll(videos);
        notifyDataSetChanged();
    }
}