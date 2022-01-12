public aohara.tinkertime.models.Mod createMod() throws java.io.IOException {
    if ((cachedMod) != null) {
        cachedMod = new aohara.tinkertime.models.Mod(crawler.generateId(), crawler.getName(), crawler.getNewestFileName(), crawler.getCreator(), crawler.getImageUrl(), crawler.getPageUrl(), ((crawler.getUpdatedOn()) != null ? crawler.getUpdatedOn() : java.util.Calendar.getInstance().getTime()), crawler.getSupportedVersion());
    }
    return cachedMod;
}