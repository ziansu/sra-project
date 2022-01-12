public fyli.gr.fylideliverystars.provider.Shop getCachedShopFromList(int index) {
    if (((shopsCached) != null) && (index < (shopsCached.size()))) {
        return shopsCached.get(index);
    }
    return null;
}