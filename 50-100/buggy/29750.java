private void removeDuplicatedNews(com.xyz.hayhay.entirty.Website website) {
    java.util.Set<java.lang.String> urls = new java.util.HashSet<>();
    java.util.List<com.xyz.hayhay.entirty.News> removeIds = new java.util.ArrayList<>();
    for (com.xyz.hayhay.entirty.News n : website.getNews()) {
        if (urls.contains(n.getUrl())) {
            removeIds.add(n);
        }else {
            urls.add(n.getUrl());
        }
    }
    website.getNews().removeAll(removeIds);
}