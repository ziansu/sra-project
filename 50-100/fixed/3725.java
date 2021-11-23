public final java.lang.String getHtml(java.lang.String name, int maxlength, java.lang.String defaultvalue) {
    java.lang.String html = getHtml(name);
    if (!(org.giiwa.core.bean.X.isEmpty(html))) {
        if ((html.getBytes().length) >= maxlength) {
            html = org.giiwa.core.base.Html.create(html).text(maxlength);
        }
    }else {
        html = defaultvalue;
    }
    return html;
}