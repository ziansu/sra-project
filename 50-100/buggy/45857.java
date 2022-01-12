public static android.graphics.Bitmap getScaledBitmap(java.lang.String path, android.app.Activity activity) {
    android.graphics.Point size = new android.graphics.Point();
    activity.getWindowManager().getDefaultDisplay().getSize(size);
    java.lang.System.out.println(((" SIZE X Y " + (size.x)) + (size.y)));
    return com.bignerdranch.android.criminalintent.PictureUtils.getScaledBitmap(path, size.x, size.y);
}