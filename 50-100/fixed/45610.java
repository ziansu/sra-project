private org.jsoup.safety.Whitelist createWhitelist(java.util.List<java.lang.String> tags) {
    org.jsoup.safety.Whitelist wl = new org.jsoup.safety.Whitelist();
    wl.addTags(tags.toArray(new java.lang.String[]{  }));
    wl.addAttributes("div", kiosk.core.text.processor.SanitizerProcessor.ATTR_ID);
    wl.addAttributes("p", kiosk.core.text.processor.SanitizerProcessor.ATTR_ID);
    wl.addAttributes("table", kiosk.core.text.processor.SanitizerProcessor.ATTR_ID);
    wl.addAttributes("td", kiosk.core.text.processor.SanitizerProcessor.ATTR_ID);
    return wl;
}