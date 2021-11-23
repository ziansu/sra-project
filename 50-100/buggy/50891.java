static int fontsize() {
    if ((net.sf.memoranda.util.Configuration.get("BASE_FONT_SIZE")) == "") {
        net.sf.memoranda.util.Configuration.put("BASE_FONT_SIZE", "16");
        return java.lang.Integer.parseInt(net.sf.memoranda.util.Configuration.get("BASE_FONT_SIZE").toString());
    }else {
        return java.lang.Integer.parseInt(net.sf.memoranda.util.Configuration.get("BASE_FONT_SIZE").toString());
    }
}