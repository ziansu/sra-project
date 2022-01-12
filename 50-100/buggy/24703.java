@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isIndicatorClickable)) {
    }else
        if ((viewPager.getCurrentItem()) < ((fragmentsList.size()) - 2)) {
            viewPager.setCurrentItem(((viewPager.getCurrentItem()) + 1), true);
        }else {
            viewPager.setCurrentItem(0, true);
        }
    
}