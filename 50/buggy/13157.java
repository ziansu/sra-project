private static boolean allZero(java.nio.ByteBuffer buf) {
    while ((buf.remaining()) > 0)
        if ((buf.getLong()) != 0)
            return false;
        
    
    return true;
}