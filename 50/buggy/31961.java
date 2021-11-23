@java.lang.Override
public void setInt(java.lang.String path, int value) {
    this.config.set(path, java.lang.String.valueOf(value));
    if (net.citizensnpcs.Settings.getBoolean("SaveOften")) {
        save();
    }
}