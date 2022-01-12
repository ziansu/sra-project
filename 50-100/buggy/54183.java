@java.lang.Override
public java.lang.Object getValue() {
    final java.util.List<ninja.leaping.configurate.SimpleConfigurationNode> values = this.values.get();
    synchronized(values) {
        final java.util.List<java.lang.Object> ret = new java.util.ArrayList(values.size());
        for (ninja.leaping.configurate.SimpleConfigurationNode obj : values) {
            ret.add(obj.getValue());
        }
        return ret.isEmpty() ? null : ret;
    }
}