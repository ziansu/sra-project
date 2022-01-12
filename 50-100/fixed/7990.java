public java.util.List<java.lang.String> getText() {
    java.util.List<java.lang.String> list;
    if (pl.betoncraft.betonquest.config.Config.getString("config.journal.reversed_order").equalsIgnoreCase("true")) {
        list = com.google.common.collect.Lists.reverse(texts);
    }else {
        list = new java.util.ArrayList<>(texts);
    }
    return list;
}