void finish(be.nabu.utils.io.api.ReadableContainer<be.nabu.utils.io.api.ByteBuffer> in, be.nabu.utils.io.api.WritableContainer<be.nabu.utils.io.api.ByteBuffer> out) throws java.io.IOException {
    finishCalled = true;
    flush(out);
}