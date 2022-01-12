protected static void checkExecutable(java.io.File exe) {
    com.google.common.base.Preconditions.checkState(exe.exists(), "The driver executable does not exist: %s", exe.getAbsolutePath());
    com.google.common.base.Preconditions.checkState((!(exe.isDirectory())), "The driver executable is a directory: %s", exe.getAbsolutePath());
    com.google.common.base.Preconditions.checkState(org.openqa.selenium.io.FileHandler.canExecute(exe), "The driver is not executable: %s", exe.getAbsolutePath());
}