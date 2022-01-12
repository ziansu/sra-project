public void run() {
    tl.putAll(org.loklak.data.DAO.scrapeTwitter(queryf, timezoneOffsetf, true)[1]);
}