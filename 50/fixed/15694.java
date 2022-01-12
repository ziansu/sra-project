@java.lang.Override
public void setBoolean(java.lang.String path, boolean value) {
    this.config.set(path, value);
    if (net.citizensnpcs.Settings.getBoolean("SaveOften")) {
        save();
    }
}