@java.lang.Override
public boolean isEnabled() {
    return ((_dir.get()) != null) && (_dir.get().getFileOrDir().exists());
}