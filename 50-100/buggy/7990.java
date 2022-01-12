public java.util.List<java.lang.String> getText() {
    java.util.List<java.lang.String> list;
    if (pl.betoncraft.betonquest.config.Config.getString("config.journal.reversed_order").equalsIgnoreCase("true")) {
        list = com.google.common.collect.Lists.reverse(texts);
    }else {
        list = texts;
    }
    list = new java.util.ArrayList<>(list);
    if ((mainPage) != null)
        list.add(0, mainPage);
    
    return list;
}