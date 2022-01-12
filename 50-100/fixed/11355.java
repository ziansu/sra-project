private void loadLands() {
    java.lang.Object[] lands = com.essentials.mcoldlife.main.CustomConfig.getArray(reference.FILE_LANDS, reference.CONFIG_FOLDER.toString(), reference.PATH_LANDS);
    if (lands != null) {
        for (java.lang.Object land : lands) {
            com.mcoldlife.objects.OLLand l = new com.mcoldlife.objects.OLLand(land.toString());
            com.mcoldlife.objects.RPGManager.addLand(land.toString(), l);
        }
    }
}