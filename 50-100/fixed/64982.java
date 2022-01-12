@java.lang.Override
public synchronized void onBackPressed() {
    if (((bm) != null) && ((startX) != (-1))) {
        cleanScreen();
        drawBmp(holder, bm);
        startX = startY = -1;
        isBack = true;
    }else {
        exit();
    }
}