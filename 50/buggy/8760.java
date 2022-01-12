@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    bundle = new android.os.Bundle();
    bundle.putInt("position", position);
}