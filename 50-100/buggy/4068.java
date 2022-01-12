@java.lang.Override
public java.lang.String[] getOutputClasses() {
    if (!(_isSetup)) {
        hcm.ssj.core.Log.e("not initialized");
        return null;
    }
    java.lang.String[] outputClass = new java.lang.String[_stream_out.dim];
    java.lang.System.arraycopy(_stream_out.dataclass, 0, outputClass, 0, _stream_out.dataclass.length);
    return outputClass;
}