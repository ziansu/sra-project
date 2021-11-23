private void detectTouchEventConsumed() {
    if (((headerLayoutParams.height) > (heightOfActionBar)) || ((footerLayoutParams.height) > (heightOfFooter))) {
        clearFocus();
        isTouchEventConsumed = true;
    }else {
        isTouchEventConsumed = false;
    }
}