@java.lang.Override
public boolean shouldShowModule() {
    for (com.wzx.lightmodule.library.Module child : mChildren) {
        return child.shouldShowModule();
    }
    return false;
}