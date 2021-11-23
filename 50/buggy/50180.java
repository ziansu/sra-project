@com.safframework.aop.annotation.Trace
private void useCV4j() {
    com.cv4j.rxjava.RxImageData.imageData(bitmap).addFilter(new com.cv4j.core.filters.GaussianBlurFilter(20)).placeholder(R.drawable.test_filters).into(image2);
}