public static <S extends com.ociweb.pronghorn.pipe.MessageSchema> java.nio.ByteBuffer readBytes(com.ociweb.pronghorn.pipe.Pipe<S> pipe, java.nio.ByteBuffer target, int meta, int len) {
    if (meta >= 0) {
        return com.ociweb.pronghorn.pipe.Pipe.readBytesRing(pipe, len, target, com.ociweb.pronghorn.pipe.Pipe.restorePosition(pipe, meta));
    }else {
        return com.ociweb.pronghorn.pipe.Pipe.readBytesConst(pipe, len, target, ((PipeReader.POS_CONST_MASK) & meta));
    }
}