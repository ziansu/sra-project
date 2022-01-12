@java.lang.Override
public void on(org.mwdb.manager.KBuffer[] payloads) {
    org.mwdb.manager.KChunk result = null;
    if (((payloads.length) > 0) && ((payloads[0]) != null)) {
        result = selfPointer._space.create(type, world, time, id, payloads[0], null);
        selfPointer._space.putAndMark(result);
    }
    callback.on(result);
}