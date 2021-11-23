public static android.graphics.Bitmap getAvatarValidBitmap(android.graphics.Bitmap bitmap) {
    return org.puresoftware.chocalandroid.ChocalImage.resize(org.puresoftware.chocalandroid.ChocalImage.cropToSquare(bitmap), 128, 128);
}