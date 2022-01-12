@java.lang.Override
public void onClick(android.view.View view) {
    if (null != fileName) {
        this.onPlayButtonClick(fileName);
    }else {
        this.onPlayButtonClick(mCurrent.getFilePath());
    }
}