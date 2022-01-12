@java.lang.Override
public synchronized net.viktorc.detroid.framework.uci.SearchResults get() throws java.lang.InterruptedException {
    while (!(isDone)) {
        wait();
    } 
    return results;
}