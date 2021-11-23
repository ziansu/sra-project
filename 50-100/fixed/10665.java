@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.previous_button :
            int index = (questionPager.getCurrentItem()) - 1;
            questionPager.setCurrentItem((index >= 0 ? index : (questionAdapter.getCount()) - 1));
            break;
        case R.id.next_button :
            questionPager.setCurrentItem((((questionPager.getCurrentItem()) + 1) % (questionAdapter.getCount())));
            break;
    }
}