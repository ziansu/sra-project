@java.lang.Override
public void recycle(java.util.zip.Deflater deflater) {
    if ((_deflater.get()) == null) {
        deflater.reset();
        _deflater.set(deflater);
    }else
        deflater.end();
    
}