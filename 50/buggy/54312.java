@java.lang.Override
public void stop() {
    if ((instance) != null) {
        return ;
    }
    instance.close();
}