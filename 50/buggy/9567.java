public static synchronized com.gigigo.orchextra.ocm.OCManager getInstance() {
    if ((com.gigigo.orchextra.ocm.OCManager.instance) != null) {
        return com.gigigo.orchextra.ocm.OCManager.instance;
    }
    return new com.gigigo.orchextra.ocm.OCManager();
}