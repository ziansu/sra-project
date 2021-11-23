@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    java.lang.String[] imageIdAndExt = imageIdAndExts.get(index).split("\\.");
    final java.lang.String url = anabolicandroids.chanobol.api.ApiModule.imgUrl(boardName, imageIdAndExt[0], ("." + (imageIdAndExt[1])));
    ion.build(imageView).placeholder(image).deepZoom().load(url);
}