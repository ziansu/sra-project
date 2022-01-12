public void setUrl(java.lang.String url) {
    try {
        stub = new es.caib.rolsac.api.v2.estadistica.ws.EstadisticaWSSoapBindingStub(new java.net.URL((url + (es.caib.rolsac.api.v2.general.ConfiguracioServeis.NOM_SERVEI_ESTADISTICA))), null);
    } catch (org.apache.axis.AxisFault e) {
        e.printStackTrace();
    } catch (java.net.MalformedURLException e) {
        e.printStackTrace();
    }
}