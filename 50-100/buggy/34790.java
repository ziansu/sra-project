@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup container, int position) {
    android.view.View imageLayout = mLayoutInflater.inflate(R.layout.view_images, container, false);
    assert imageLayout != null;
    final com.facebook.drawee.view.SimpleDraweeView imageView = ((com.facebook.drawee.view.SimpleDraweeView) (imageLayout.findViewById(R.id.imageView)));
    imageView.setController(Infrastructure.AppCommon.getDraweeController(imageView, productImageUrlList.get(position), 400));
    container.addView(imageLayout, 0);
    return imageLayout;
}