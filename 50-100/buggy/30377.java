private void addOwnGreynessAsPreference(android.graphics.Bitmap image) {
    double greyness = dan.dit.whatsthat.util.image.BitmapUtil.calculateGreyness(image);
    android.util.Log.d("Image", ((("Image greyness : " + greyness) + " for image ") + (mImage.mName)));
    if (greyness <= (dan.dit.whatsthat.util.image.BitmapUtil.GREYNESS_STRONG_THRESHOLD)) {
        addPreferredRiddleType(ContentRiddleType.GREY_VERY_INSTANCE);
    }else
        if (greyness > (dan.dit.whatsthat.util.image.BitmapUtil.GREYNESS_MEDIUM_THRESHOLD)) {
            addPreferredRiddleType(ContentRiddleType.GREY_LITTLE_INSTANCE);
        }else {
            addPreferredRiddleType(ContentRiddleType.GREY_MEDIUM_INSTANCE);
        }
    
}