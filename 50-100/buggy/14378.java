public static android.support.v4.app.Fragment newInstance(fr.ludovic.vimont.carouselviewpager.MainActivity context, fr.ludovic.vimont.carouselviewpager.Entity entity, int position, float scale) {
    android.os.Bundle b = new android.os.Bundle();
    b.putInt("position", position);
    b.putInt("image", entity.imageResId);
    b.putString("title", entity.titleRes);
    b.putFloat("scale", scale);
    return android.support.v4.app.Fragment.instantiate(context, fr.ludovic.vimont.carouselviewpager.CarouselFragment.class.getName(), b);
}