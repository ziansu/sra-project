private void onClear() {
    if (android.text.TextUtils.isEmpty(mBuffer)) {
        for (com.doomonafireball.repmaxcalculator.widget.RepMaxView repMaxView : mRepMaxViews) {
            repMaxView.clearWeight();
        }
        return ;
    }
    reveal(mDeleteButton, R.color.blue_700, new android.animation.AnimatorListenerAdapter() {
        @java.lang.Override
        public void onAnimationEnd(android.animation.Animator animation) {
            mBuffer = "";
            for (com.doomonafireball.repmaxcalculator.widget.RepMaxView repMaxView : mRepMaxViews) {
                repMaxView.clearWeight();
            }
        }
    });
}