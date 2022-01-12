@java.lang.Override
public void put(T elem) throws java.lang.InterruptedException {
    synchronized(array) {
        while ((array.size()) == (size))
            array.wait();
        
        array.set(((first) + ((size)++)), elem);
        array.notify();
    }
}