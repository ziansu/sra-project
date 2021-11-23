private void mearsureHeader(android.view.ViewGroup header) {
    android.view.ViewGroup.LayoutParams p = header.getLayoutParams();
    int widthSpec = com.project.gu.testnestedscrollingfirst.content.sinaweibo.MeasureSpec.makeMeasureSpec(p.width, MeasureSpec.EXACTLY);
    int heightSpec = com.project.gu.testnestedscrollingfirst.content.sinaweibo.MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED);
    header.measure(widthSpec, heightSpec);
}