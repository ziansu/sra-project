public static void deleteUselessImage(java.util.ArrayList<java.lang.String> arrayList) {
    for (int i = 0; i < (arrayList.size()); i++) {
        java.lang.String animeImagePath = arrayList.get(i);
        java.io.File image = new java.io.File(animeImagePath);
        try {
            util.FileManager.deleteData(image);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}