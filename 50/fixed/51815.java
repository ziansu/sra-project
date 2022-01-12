public void run() {
    for (java.lang.String guid : guids) {
        try {
            geoObjectService.delete(extSysId, guid);
        } catch (java.lang.Exception e) {
            setErrors(true);
        }
    }
}