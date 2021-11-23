public fyli.gr.fylideliverystars.provider.Shop getCachedShopFromList(int index) {
    if ((shopsCached) != null) {
        return shopsCached.get(index);
    }
    return null;
}