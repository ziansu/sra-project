@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup container, int position) {
    android.view.View itemView;
    itemView = mLayoutInflater.inflate(R.layout.problem_images_view_pager_item, container, false);
    android.widget.ImageView problemImageView = ((android.widget.ImageView) (itemView.findViewById(R.id.problem_image_view)));
    loadImage(mResources[position], container.getContext(), problemImageView);
    container.addView(itemView);
    return itemView;
}