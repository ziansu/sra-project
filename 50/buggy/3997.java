@java.lang.Override
public void onStop() {
    super.onStop();
    try {
        mDocument.writeFile("diary.dat");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}