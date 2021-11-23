@java.lang.Override
public void run() {
    synchronized(this) {
        if (null != (progresses)) {
            for (int i = 0; (i < (progresses.length)) && (i < (progressBars.length)); i++) {
                fr.petrus.lib.core.Progress progress = event.getProgress(i);
                if (null != progress) {
                    progresses[i].set(progress);
                    updateProgressBar(i);
                }
            }
        }
    }
}