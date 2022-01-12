public void played(ejs.base.sound.ISoundView view) {
    try {
        if ((soundWritingThread) == null) {
            if ((!(block)) && ((soundQueue.remainingCapacity()) == 0))
                soundQueue.remove();
            
        }
        ejs.base.sound.AudioChunk o = new ejs.base.sound.AudioChunk(view, volume);
        soundQueue.put(o);
    } catch (java.lang.InterruptedException e) {
    }
}