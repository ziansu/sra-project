@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_UP)) {
        if (com.ha81dn.webausleser.MainActivity.PlaceholderFragment.itemsMoved) {
            com.ha81dn.webausleser.MainActivity.PlaceholderFragment.itemsMoved = false;
            android.content.Intent intentUpdate = new android.content.Intent();
            intentUpdate.setAction("com.ha81dn.webausleser.ASYNC_MAIN");
            intentUpdate.addCategory(Intent.CATEGORY_DEFAULT);
            intentUpdate.putExtra("SORTING", "SAVE_SORT_NOW");
            getActivity().sendBroadcast(intentUpdate);
        }
    }
    return false;
}