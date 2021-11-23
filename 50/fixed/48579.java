@java.lang.Override
public void onClick(android.view.View v) {
    if ((list.size()) > 1) {
        viewPager.imageClick((position - 1));
    }else {
        viewPager.imageClick(position);
    }
}