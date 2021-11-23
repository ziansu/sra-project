public java.lang.String toHtmlString() {
    return this.toString().replaceAll("\n", "<br/>").replaceAll("\t", "&nbsp;&nbsp;&nbsp;&nbsp;");
}