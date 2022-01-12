private void changeCurrentTrack(boolean forward, grooveberryserver.readingqueue.ReadingQueueManager.TrackFlags trackFlags) {
    int shiftInt;
    if (readingQueue.isRandomised()) {
        java.util.Random rand = new java.util.Random();
        shiftInt = rand.nextInt(((readingQueue.size()) - 1));
    }else
        if (forward) {
            shiftInt = (readingQueue.getCurrentTrackPosition()) + 1;
        }else {
            shiftInt = (readingQueue.getCurrentTrackPosition()) - 1;
        }
    
    readingQueue.setCurrentTrackPostion(shiftInt);
}