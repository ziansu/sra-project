public static android.graphics.Bitmap getAvatarValidBitmap(android.graphics.Bitmap bitmap) {
    return org.puresoftware.chocalandroid.ChocalImage.cropToSquare(org.puresoftware.chocalandroid.ChocalImage.resize(bitmap, 128, 128));
}