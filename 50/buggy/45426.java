private void reset() {
    setButtonStatus();
    resetSec();
    resetTimeText();
    com.ioman.counter.util.FileUtils.write(title, 0L, 0L);
}