private void getPhotosById(java.io.Serializable clothes) {
    com.cs528.style.style.clothes.Clothes[] array = ((com.cs528.style.style.clothes.Clothes[]) (clothes));
    com.cs528.style.style.database.ClothesDatabase.init(getApplicationContext());
    for (int i = 0; i < (array.length); i++) {
        com.cs528.style.style.clothes.Clothes cloth = com.cs528.style.style.database.ClothesDatabase.getClothes(array[i].getId());
        filePaths.add(cloth.getClothesSrc());
    }
}