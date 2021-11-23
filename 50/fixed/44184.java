@java.lang.Override
public void onPageScrollStateChanged(int state) {
    if (state == 1) {
        slideByUser = true;
    }else
        if (state == 2) {
        }else {
            slideByUser = false;
        }
    
}