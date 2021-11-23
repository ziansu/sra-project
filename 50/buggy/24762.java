private org.harctoolbox.harchardware.ir.GlobalCache.GlobalCacheIrTransmitter newGlobalCacheIrTransmitter(org.harctoolbox.harchardware.ir.Transmitter trans) {
    if (trans == null)
        return new org.harctoolbox.harchardware.ir.GlobalCache.GlobalCacheIrTransmitter();
    
    org.harctoolbox.harchardware.ir.GlobalCache.GlobalCacheIrTransmitter tr = ((org.harctoolbox.harchardware.ir.GlobalCache.GlobalCacheIrTransmitter) (trans));
    tr.normalize(firstIrModule);
    return tr;
}