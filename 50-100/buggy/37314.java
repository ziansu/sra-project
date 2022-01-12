@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_MOVE)) {
        fr.esir.fragments.MainFragment np = fr.esir.maintasks.MyActivity.mp;
        fm.beginTransaction().replace(R.id.containerMain, np).commit();
    }
    return true;
}