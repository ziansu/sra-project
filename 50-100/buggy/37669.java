@java.lang.Override
public void viewOnTop(int position, android.view.View itemView) {
    android.util.Log.d("viewOnTop", ("position==" + position));
    if (position == 0) {
        vp.setCurrentItem(1);
    }else
        if (position == 2) {
            adapter.animProgress(itemView);
        }
    
}