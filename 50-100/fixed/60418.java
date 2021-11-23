public void setLang(org.sefaria.sefaria.Util.Lang lang) {
    if (lang == (Util.Lang.HE)) {
        tv.setText(heTitle);
        tv.setTypeface(org.sefaria.sefaria.MyApp.getFont(MyApp.TAAMEY_FRANK_FONT));
    }else {
        tv.setText(enTitle);
        tv.setTypeface(org.sefaria.sefaria.MyApp.getFont(MyApp.TAAMEY_FRANK_FONT));
    }
}