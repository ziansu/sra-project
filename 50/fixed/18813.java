@java.lang.Override
public void onClick(android.view.View view) {
    if ((currentBook) == 1) {
        currentBook = 66;
    }else {
        currentBook -= 1;
    }
    updateRecycleView(currentBook);
}