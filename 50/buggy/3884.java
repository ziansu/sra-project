private com.metal.fetcher.model.WeiboAccount getRandomAccount() {
    return com.metal.fetcher.fetcher.impl.WeiboFetcher.weiboAccountList.get(((com.metal.fetcher.fetcher.impl.WeiboFetcher.RANDOM.nextInt()) % (com.metal.fetcher.fetcher.impl.WeiboFetcher.weiboAccountList.size())));
}