public java.lang.String getDllink() {
    return br.getRegex("(/download\\.php\\?file=[^<>\"]+)").getMatch(0);
}