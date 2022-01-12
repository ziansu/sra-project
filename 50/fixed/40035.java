public java.util.ArrayList<Proc> spawnNextSet() {
    java.util.ArrayList<Proc> currentSet = new java.util.ArrayList<Proc>(nextSet);
    genNextSet();
    return currentSet;
}