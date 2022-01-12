public void setFont() {
    java.lang.String srcFont = org.omegat.util.Preferences.getPreference(OConsts.TF_SRC_FONT_NAME);
    if (!(srcFont.isEmpty())) {
        int fontsize;
        try {
            fontsize = java.lang.Integer.parseInt(org.omegat.util.Preferences.getPreference(OConsts.TF_SRC_FONT_SIZE));
        } catch (java.lang.NumberFormatException nfe) {
            fontsize = 12;
        }
        setFont(new java.awt.Font(srcFont, java.awt.Font.PLAIN, fontsize));
    }
}