void addArrayList(java.util.ArrayList<net.biospherecorp.urss.Article> articles) {
    _list.addAll(articles);
    java.util.Collections.sort(_list);
    notifyDataSetChanged();
    autoLoadArticle(getLatestArticle());
}