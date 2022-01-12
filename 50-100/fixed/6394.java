private void getPhotosById(java.io.Serializable clothes) {
    java.lang.Object[] array = ((java.lang.Object[]) (clothes));
    com.cs528.style.style.database.ClothesDatabase.init(getApplicationContext());
    for (int i = 0; i < (array.length); i++) {
        com.cs528.style.style.clothes.Clothes cloth = com.cs528.style.style.database.ClothesDatabase.getClothes(((java.lang.Integer) (array[i])));
        filePaths.add(cloth.getClothesSrc());
    }
}