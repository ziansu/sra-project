static int socketType(final com.spotify.netty4.handler.codec.zmtp.ZMTPSocketType socketType) {
    switch (socketType) {
        case PAIR :
            return 0;
        case PUB :
            return 1;
        case SUB :
            return 2;
        case REQ :
            return 3;
        case REP :
            return 4;
        case DEALER :
            return 5;
        case ROUTER :
            return 6;
        case PULL :
            return 7;
        case PUSH :
            return 8;
        default :
            throw new java.lang.IllegalArgumentException(("Unknown socket type: " + socketType));
    }
}