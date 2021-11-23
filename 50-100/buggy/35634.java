@java.lang.Override
public void run() {
    if (!(canScroll(horizontalScrollView))) {
        horizontalScrollView.fullScroll(View.FOCUS_LEFT);
    }else {
        int widthOfOneElement = linSpecialProducts.getChildAt(0).getMeasuredWidth();
        horizontalScrollView.scrollTo((((int) (horizontalScrollView.getScrollX())) + widthOfOneElement), ((int) (horizontalScrollView.getScrollY())));
    }
}