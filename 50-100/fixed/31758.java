public static java.lang.String CreateOkMessage(final java.lang.String id, java.lang.String dest) {
    dest = pl.tcp.MessageCoder.InsertHeader(dest);
    dest = pl.tcp.MessageCoder.KeyValuePairToString(pl.tcp.MessageCoder.ACTION, pl.tcp.MessageCoder.OK, dest);
    dest = pl.tcp.MessageCoder.KeyValuePairToString(pl.tcp.MessageCoder.MESSAGE_ID, id, dest);
    dest = pl.tcp.MessageCoder.KeyValuePairToString(pl.tcp.MessageCoder.MESSAGE_END, 0, dest);
    dest = pl.tcp.MessageCoder.AddEndlLine(dest);
    dest = pl.tcp.MessageCoder.InsertLenMessageHeader(dest);
    return dest;
}