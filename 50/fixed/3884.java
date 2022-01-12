private com.metal.fetcher.model.WeiboAccount getRandomAccount() {
    return com.metal.fetcher.fetcher.impl.WeiboFetcher.weiboAccountList.get(java.lang.Math.abs(((com.metal.fetcher.fetcher.impl.WeiboFetcher.RANDOM.nextInt()) % (com.metal.fetcher.fetcher.impl.WeiboFetcher.weiboAccountList.size()))));
}