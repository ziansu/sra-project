public static java.lang.String readLine(io.netty.buffer.ByteBuf data) {
    java.lang.StringBuilder str = new java.lang.StringBuilder();
    while ((data.readableBytes()) > 1) {
        char c = data.readChar();
        if (c == '\n')
            break;
        else
            str.append(c);
        
    } 
    return str.toString();
}