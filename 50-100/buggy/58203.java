@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup container, int position) {
    inflater = ((android.view.LayoutInflater) (ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    android.view.View swiper_view = ((android.view.View) (inflater.inflate(R.layout.swiper_layout, container, false)));
    android.widget.ImageView sliderimage = ((android.widget.ImageView) (swiper_view.findViewById(R.id.swiper_imageview)));
    sliderimage.setImageResource(images[position]);
    container.addView(swiper_view);
    return swiper_view;
}