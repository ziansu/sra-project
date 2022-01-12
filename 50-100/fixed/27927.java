private void onPickCity(java.lang.String provice, java.lang.String city) {
    try {
        m_txtCity.setText(((provice + "/") + city));
        m_actorVo.setCity(((provice + "/") + city));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}