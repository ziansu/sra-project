@java.lang.Override
public net.viktorc.detroid.framework.uci.SearchResults get() {
    while (!(isDone)) {
        synchronized(this) {
            try {
                wait();
            } catch (java.lang.InterruptedException e) {
            }
        }
    } 
    return results;
}