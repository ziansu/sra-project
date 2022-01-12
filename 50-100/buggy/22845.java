public void removeListeners() {
    if (!(href.equals(""))) {
        java.lang.String value;
        value = m_oBrowser.getUrl();
        java.lang.System.out.println("set browser to blank screen");
        m_oBrowser.setUrl("about:blank");
        if ((!(value.equals(""))) && (!(value.equals("about:blank")))) {
            m_sActRef = value;
        }
        java.lang.System.gc();
    }
}