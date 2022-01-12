private void reset() {
    resetSec();
    setButtonStatus();
    resetTimeText();
    com.ioman.counter.util.FileUtils.write(title, 0L, 0L);
}