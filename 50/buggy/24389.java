@java.lang.Override
public void init() {
    ran = new java.util.Random(java.lang.System.currentTimeMillis());
    load();
    shuffle();
}