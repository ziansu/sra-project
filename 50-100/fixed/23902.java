@java.lang.Override
public synchronized void clear() {
    this.clear = true;
    this.lengths.clear();
    this.values.clear();
    if (this.queue) {
        this.queue = false;
        javafx.application.Platform.runLater(this);
    }
}