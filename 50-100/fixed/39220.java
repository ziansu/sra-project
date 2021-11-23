@java.lang.Override
public void parse(im.actor.core.api.BserValues values) throws java.io.IOException {
    this.array = new java.util.ArrayList<im.actor.core.api.ApiRawValue>();
    for (byte[] b : values.getRepeatedBytes(1)) {
        array.add(im.actor.core.api.ApiRawValue.fromBytes(b));
    }
}