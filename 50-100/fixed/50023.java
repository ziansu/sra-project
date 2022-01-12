@java.lang.Override
public au.edu.jcu.v4l4j.impl.omx.OMXQueryControl.OMXQueryControlGetter<R> setAndGet() {
    return new au.edu.jcu.v4l4j.impl.omx.OMXQueryControl.OMXQueryControlGetter<>(doGetChildParent(), timeout, ( state) -> {
        au.edu.jcu.v4l4j.impl.omx.OMXComponent component = this.component;
        int queryId = this.queryId;
        java.nio.ByteBuffer buffer = state.valueMap.getBuffer();
        component.accessConfig(false, false, queryId, buffer);
        component.accessConfig(false, true, queryId, buffer);
    });
}