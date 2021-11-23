public static com.github.cambierr.lorawanpacket.MType from(byte _mhdr) throws com.github.cambierr.lorawanpacket.MalformedPacketException {
    byte mType = ((byte) (-((_mhdr >> 5) & 7)));
    for (com.github.cambierr.lorawanpacket.MType v : com.github.cambierr.lorawanpacket.MType.values()) {
        if ((v.value) == mType) {
            return v;
        }
    }
    throw new com.github.cambierr.lorawanpacket.MalformedPacketException("MType");
}