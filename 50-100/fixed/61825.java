@java.lang.Override
public java.lang.String toString() {
    if (null == (str)) {
        synchronized(this) {
            if ((logFullDebug) && (null != (data))) {
                if (streamHasStrings) {
                    str = new java.lang.String(data, esa.mo.mal.transport.gen.GENTransport.UTF8_CHARSET);
                }else {
                    str = esa.mo.mal.transport.gen.util.GENHelper.byteArrayToHexString(data);
                }
            }else {
                str = "";
            }
        }
    }
    return str;
}