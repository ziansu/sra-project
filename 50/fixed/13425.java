private static void parseContent(com.czbix.v2ex.model.Topic.Builder builder, org.jsoup.select.Elements elements) {
    if ((elements.size()) == 0)
        return ;
    
    final org.jsoup.nodes.Element ele = elements.get(0);
    builder.setContent(ele.html());
}