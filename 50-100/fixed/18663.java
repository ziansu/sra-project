@java.lang.Override
public void run() {
    while (!(done)) {
        synchronized(buffer) {
            if (!(buffer.empty())) {
                java.lang.String str = buffer.get();
                org.junit.Assert.assertNotNull(str);
                (consumed)++;
            }
        }
    } 
}