@java.lang.Override
public void recycle(java.util.zip.Deflater deflater) {
    deflater.reset();
    if ((_deflater.get()) == null)
        _deflater.set(deflater);
    
}