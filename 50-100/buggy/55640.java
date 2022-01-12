public java.util.List<com.example.facundo.recorridaszotp._3_Domain.Ranchada> filtrarPorZona(java.lang.String sZona) {
    java.util.List<com.example.facundo.recorridaszotp._3_Domain.Ranchada> listaRanchadas = null;
    if (sZona != null) {
        com.example.facundo.recorridaszotp._3_Domain.Zona zona = new com.activeandroid.query.Select().from(com.example.facundo.recorridaszotp._3_Domain.Zona.class).where("Nombre = ?", sZona).executeSingle();
        if (zona != null) {
            listaRanchadas = new com.activeandroid.query.Select().from(com.example.facundo.recorridaszotp._3_Domain.Ranchada.class).where("Zona = ?", zona.getId()).execute();
        }
    }
    return listaRanchadas;
}