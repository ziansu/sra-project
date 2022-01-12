private void playQueue() {
    paused = false;
    if (((curPosition) >= (phraseFiles.size())) && (!(repeat))) {
        stopPhrase();
    }else {
        try {
            mp.setDataSource(phraseFiles.get(curPosition));
            mp.prepare();
            mp.start();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        (curPosition)++;
    }
}