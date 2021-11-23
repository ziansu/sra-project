public java.lang.String getTag(int code) {
    if ((code < 0) || (code >= (USU.CS.Utils.POSTagConverter.POSLIST.length)))
        return null;
    
    return USU.CS.Utils.POSTagConverter.POSLIST[code];
}