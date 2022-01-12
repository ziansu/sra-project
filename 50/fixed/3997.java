@java.lang.Override
public void onStop() {
    super.onStop();
    try {
        mDocument.writeFile();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}