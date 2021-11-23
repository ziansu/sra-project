private void removeDuplicatedNews(com.xyz.hayhay.entirty.Website website) {
    java.util.List<com.xyz.hayhay.entirty.News> removeIds = new java.util.ArrayList<>();
    for (com.xyz.hayhay.entirty.News n : website.getNews()) {
        if (website.getNews().contains(n)) {
            removeIds.add(n);
        }
    }
    website.getNews().removeAll(removeIds);
}