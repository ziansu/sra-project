public void setList(java.util.List<com.zolotuhinartem.lastfminfo.LastFmApi.response.pojo.album_search.Album> list) {
    this.list = list;
    java.util.Collections.sort(this.list);
    notifyDataSetChanged();
}