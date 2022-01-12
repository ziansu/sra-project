void addArrayList(java.util.ArrayList<net.biospherecorp.urss.Article> articles) {
    _list.addAll(articles);
    java.util.Collections.sort(_list);
    notifyDataSetChanged();
    if ((_list.size()) > 0) {
        autoLoadArticle(getLatestArticle());
    }
}