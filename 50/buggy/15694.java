@java.lang.Override
public void setBoolean(java.lang.String path, boolean value) {
    this.config.set(path, java.lang.String.valueOf(value));
    if (net.citizensnpcs.Settings.getBoolean("SaveOften")) {
        save();
    }
}