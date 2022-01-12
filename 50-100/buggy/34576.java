public static <S extends com.ociweb.pronghorn.pipe.MessageSchema> com.ociweb.pronghorn.pipe.DataOutputBlobWriter<?> readBytes(com.ociweb.pronghorn.pipe.Pipe<S> pipe, com.ociweb.pronghorn.pipe.DataOutputBlobWriter<?> target, int meta, int len) {
    if (meta < 0) {
        return com.ociweb.pronghorn.pipe.Pipe.readBytesConst(pipe, len, target, ((PipeReader.POS_CONST_MASK) & meta));
    }else {
        return com.ociweb.pronghorn.pipe.Pipe.readBytesRing(pipe, len, target, com.ociweb.pronghorn.pipe.Pipe.restorePosition(pipe, meta));
    }
}