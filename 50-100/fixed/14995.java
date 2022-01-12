public static java.lang.String getMarkdownMessage(doubledotlabs.butteryslack.ButterySlack butterySlack, java.lang.String content) {
    content = doubledotlabs.butteryslack.utils.SlackUtils.replaceInside(content, "_", "<i>%1$s</i>");
    content = doubledotlabs.butteryslack.utils.SlackUtils.replaceInside(content, "*", "<b>%1$s</b>");
    if (content.startsWith("&gt;"))
        content = ("<blockquote>&nbsp;" + (content.replace("&gt;", ""))) + "</blockquote>";
    
    return content;
}