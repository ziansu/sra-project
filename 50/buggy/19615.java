@java.lang.Override
public MerkleBNode createMBT() {
    return this.getRoot().createHashNode();
}