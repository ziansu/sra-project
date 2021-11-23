@java.lang.Override
public void initialize(long epoch) {
    com.google.common.base.Preconditions.checkArgument((epoch > 0), "epoch must be a positive number.");
    if (!(this.isPreInitialized)) {
        this.baseStorage.initialize(epoch);
    }
}