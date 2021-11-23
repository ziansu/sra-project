private static void storePictureToCollection(android.graphics.Bitmap bitmap, java.lang.String filename) throws java.lang.Exception {
    com.thirty.java.newsapp.PictureApi.storePictureToDir(bitmap, com.thirty.java.newsapp.PictureApi.getPictureCollectionDirectory().toString(), filename);
}