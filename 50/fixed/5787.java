@java.lang.Override
public void onResult(io.datakernel.bytebuf.ByteBuf buf) {
    callback.onResult(createHttpResponse(buf, finalPath));
}