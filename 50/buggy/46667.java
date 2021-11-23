@java.lang.Override
public java.util.Collection<permlib.Permutation> getPermsTo(int length) {
    permlib.processor.PermCollector collector = new permlib.processor.PermCollector();
    for (int i = 4; i <= length; i++) {
        processPerms(length, collector);
    }
    return collector.getCollection();
}