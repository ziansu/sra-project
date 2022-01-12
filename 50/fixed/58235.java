@java.lang.Override
public void serialize(im.actor.core.api.BserWriter writer) throws java.io.IOException {
    for (im.actor.core.api.ApiRawValue i : this.array) {
        writer.writeBytes(1, i.buildContainer());
    }
}