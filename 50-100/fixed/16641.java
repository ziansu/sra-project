@java.lang.Override
public void content(final io.netty.buffer.ByteBuf data) {
    if ((data.readableBytes()) < (frameLength)) {
        return ;
    }
    if ((frameLength) > 0) {
        final io.netty.buffer.ByteBuf frame = data.readSlice(frameLength);
        frame.retain();
        part.add(new com.spotify.netty4.handler.codec.zmtp.ZMTPFrame(frame));
    }else
        if ((part) == (tail)) {
            part.add(com.spotify.netty4.handler.codec.zmtp.ZMTPFrame.EMPTY_FRAME);
        }else {
            delimited = true;
            part = tail;
        }
    
}