public void run() {
    for (org.w2fc.geoportal.ws.RequestGeoObject requestGeoObject : geoObjectsReq) {
        try {
            geoObjectService.createAndSaveObject(requestGeoObject);
        } catch (java.lang.Exception e) {
            setErrors(true);
        }
    }
}