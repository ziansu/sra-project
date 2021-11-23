@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_MOVE)) {
        fr.esir.fragments.NextProgramming np = new fr.esir.fragments.NextProgramming();
        fm.beginTransaction().replace(R.id.containerMain, np).commit();
    }
    return true;
}