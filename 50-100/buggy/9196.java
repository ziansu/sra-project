static void title_change(java.lang.String title, int id) {
    org.embedded.browser.Chromium.chmap.get(id).loaded = true;
    if (title.equals(""))
        return ;
    
    if (org.embedded.browser.Chromium.chmap.containsKey(id))
        org.embedded.browser.Chromium.chmap.get(id).title_change(title);
    
}