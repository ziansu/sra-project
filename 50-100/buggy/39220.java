@java.lang.Override
public void parse(im.actor.core.api.BserValues values) throws java.io.IOException {
    java.util.List<byte[]> _array = values.getRepeatedBytes(1);
    this.array = new java.util.ArrayList<im.actor.core.api.ApiRawValue>();
    for (int i = 0; i < (values.getRepeatedCount(1)); i++) {
        array.add(im.actor.core.api.ApiRawValue.fromBytes(_array.get(i)));
    }
}