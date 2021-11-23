public java.util.ArrayList<Proc> spawnNextSet() {
    java.util.ArrayList<Proc> currentSet = nextSet;
    genNextSet();
    return currentSet;
}