private java.util.ArrayList<com.example.igiagante.thegarden.home.plants.presentation.dataHolders.GardenHolder> createGardenHolderList(java.util.List<com.example.igiagante.thegarden.core.domain.entity.Garden> gardens) {
    java.util.ArrayList<com.example.igiagante.thegarden.home.plants.presentation.dataHolders.GardenHolder> gardenHolders = new java.util.ArrayList<>();
    for (int i = 0; i < (gardens.size()); i++) {
        gardenHolders.add(createGardenHolder(gardens.get(0), i));
    }
    return gardenHolders;
}