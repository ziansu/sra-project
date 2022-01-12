private void refreshCategories() {
    idNameCategoryMap = new java.util.HashMap<>();
    idCategoryMap = new java.util.HashMap<>();
    java.util.List<com.bionic.edu.entity.DishCategory> dishCategories = dishCategoryService.findAll();
    for (com.bionic.edu.entity.DishCategory dc : dishCategories) {
        idNameCategoryMap.put(dc.getName(), java.lang.String.valueOf(dc.getId()));
        idCategoryMap.put(java.lang.String.valueOf(dc.getId()), dc);
    }
}