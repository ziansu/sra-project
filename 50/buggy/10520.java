public java.lang.String toHtmlString() {
    return toString().replaceAll("\n", "<br/>").replaceAll("\t", "&nbsp;&nbsp;&nbsp;&nbsp;");
}