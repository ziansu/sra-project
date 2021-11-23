@java.lang.Override
public void run() {
    modifyFields(indexed(propPath, findex), null, false);
    refresh();
}