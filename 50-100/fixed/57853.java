@java.lang.Override
public synchronized java.lang.Void doInBackground() {
    for (java.lang.String word : words) {
        if (!(isCancelled())) {
            mywm.addWord(word);
            update();
        }else {
            break;
        }
    }
    pbar.close();
    return null;
}