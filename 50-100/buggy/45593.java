public void renderLoadJavascript(@to.etc.domui.dom.Nonnull
java.lang.String path) throws java.lang.Exception {
    if (!(path.startsWith("http"))) {
        java.lang.String rurl = m_page.getBody().getThemedResourceRURL(path);
        path = ctx().getRelativePath(rurl);
    }
    o().tag("script");
    o().attr("language", "javascript");
    o().attr("src", path);
    o().endtag();
    o().closetag("script");
}