@java.lang.Override
public synchronized java.lang.Void doInBackground() {
    for (java.lang.String word : words) {
        if (!(isCancelled())) {
            mywm.addWord(word);
            update();
            try {
                java.lang.Thread.sleep(500);
            } catch (java.lang.Exception ex) {
            }
        }else {
            break;
        }
    }
    pbar.close();
    return null;
}