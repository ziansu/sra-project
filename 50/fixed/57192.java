public void setList(java.util.List<com.zolotuhinartem.lastfminfo.LastFmApi.response.pojo.album_search.Album> list) {
    this.list = list;
    if ((this.list) != null) {
        java.util.Collections.sort(this.list);
    }
    notifyDataSetChanged();
}