@java.lang.Override
public boolean nextKeyValue() throws java.io.IOException, java.lang.InterruptedException {
    if (done)
        return false;
    else {
        done = true;
        return true;
    }
}