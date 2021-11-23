public ml.rabidbeaver.jna.cups_dest_s[] listPrinters() {
    if ((serv_conn_p) == null)
        return null;
    
    com.sun.jna.ptr.PointerByReference p = new com.sun.jna.ptr.PointerByReference();
    int s = cups.cupsGetDests2(serv_conn_p, p);
    com.sun.jna.Pointer ptr = p.getValue();
    ml.rabidbeaver.jna.cups_dest_s cdest = new ml.rabidbeaver.jna.cups_dest_s(ptr);
    cdest.read();
    ml.rabidbeaver.jna.cups_dest_s[] dests = ((ml.rabidbeaver.jna.cups_dest_s[]) (cdest.toArray(s)));
    return dests;
}