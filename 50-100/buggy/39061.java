@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    from = position - 1;
    if (((to) != (com.github.adnansm.timelytextview.sample.MainActivity.NO_VALUE)) && ((to) != (com.github.adnansm.timelytextview.sample.MainActivity.NO_VALUE))) {
        objectAnimator = timelyView.animate(from, to);
        objectAnimator.setDuration(com.github.adnansm.timelytextview.sample.MainActivity.DURATION);
    }else {
        objectAnimator = null;
    }
}