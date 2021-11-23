@java.lang.Override
public void run() {
    while (!(done)) {
        if (!(buffer.empty())) {
            java.lang.String str = buffer.get();
            org.junit.Assert.assertNotNull(str);
            (consumed)++;
        }
    } 
}