@java.lang.Override
public synchronized void onBackPressed() {
    if (((!(isBack)) && ((bm) != null)) && ((startX) != (-1))) {
        cleanScreen();
        drawBmp(holder, bm);
        isBack = true;
    }else {
        exit();
    }
}