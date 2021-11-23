@java.lang.Override
public void setLong(java.lang.String path, long value) {
    this.config.set(path, value);
    if (net.citizensnpcs.Settings.getBoolean("SaveOften")) {
        save();
    }
}