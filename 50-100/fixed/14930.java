private void loadLands() {
    java.lang.String[] lands = ((java.lang.String[]) (com.essentials.mcoldlife.main.CustomConfig.getArray(reference.FILE_LANDS, reference.CONFIG_FOLDER.toString(), reference.PATH_LANDS)));
    if (lands != null) {
        for (java.lang.String land : lands) {
            com.mcoldlife.objects.OLLand l = new com.mcoldlife.objects.OLLand(land);
            com.mcoldlife.objects.RPGManager.addLand(land, l);
        }
    }
}