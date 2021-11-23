@java.lang.Override
public void run() {
    if ((getSheetView()) != null) {
        if ((sheetView.getMeasuredHeight()) >= (this.getMeasuredHeight())) {
            peekSheet();
        }else {
            expandSheet();
        }
    }
}