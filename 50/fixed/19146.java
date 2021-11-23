public boolean allowsAds() {
    if (!(isInherited("AllowAds")))
        return (java.lang.Integer.parseInt(Setting.CHAN_ALLOWADS.get(this))) == 1;
    
    return getGuildExt().allowsAds();
}