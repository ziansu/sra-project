public static void setWidth(final android.view.View aView, final int aWidth) {
    final android.view.ViewGroup.LayoutParams params = aView.getLayoutParams();
    params.width = com.deepercreeper.vampireapp.util.ViewUtil.calcPx(aWidth, aView.getContext());
}