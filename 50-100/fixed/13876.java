@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_scale, container, false);
    com.art2cat.dev.moonlightnote.CustomView.ZoomImageView imageView = ((com.art2cat.dev.moonlightnote.CustomView.ZoomImageView) (view.findViewById(R.id.imageView)));
    com.squareup.picasso.Picasso.with(mActivity).load(android.net.Uri.parse(mUrl)).placeholder(R.drawable.ic_cloud_download_black_24dp).memoryPolicy(com.squareup.picasso.MemoryPolicy.NO_CACHE, com.squareup.picasso.MemoryPolicy.NO_STORE).config(Bitmap.Config.RGB_565).into(imageView);
    return view;
}