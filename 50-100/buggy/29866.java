private org.robovm.llvm.debuginfo.DebugObjectFileInfo readDebugInfo(org.robovm.debugger.state.classdata.ClassInfoLoader loader) {
    java.lang.String debugInfoSymbol = ("[j]" + (className.replace('/', '.'))) + "[debuginfo]";
    long addr = loader.appFileLoader.resolveSymbol(debugInfoSymbol);
    if (addr < 0) {
        return null;
    }
    loader.reader.setAddress(addr);
    addr = loader.reader.readPointer();
    loader.reader.setAddress(addr);
    java.nio.ByteBuffer buffer = loader.reader.sliceToByteBuffer();
    return org.robovm.compiler.plugin.debug.DebugInformationTools.readDebugInfo(buffer);
}