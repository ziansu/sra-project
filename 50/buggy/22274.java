@java.lang.Override
public boolean isAutoStartup() {
    if ((this.adapter) != null) {
        return this.adapter.isAutoStartup();
    }
    return false;
}