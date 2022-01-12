private void onPickCity(android.content.Intent data) {
    try {
        java.lang.String provice = data.getStringExtra("provice");
        java.lang.String city = data.getStringExtra("city");
        java.lang.String district = data.getStringExtra("district");
        m_txtCity.setText(((provice + "/") + city));
        m_actorVo.setCity(((provice + "/") + city));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}