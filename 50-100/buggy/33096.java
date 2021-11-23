public static org.ldaptive.auth.ext.FreeIPAAccountState.Error valueOf(final int code) {
    for (org.ldaptive.auth.ext.FreeIPAAccountState.Error e : org.ldaptive.auth.ext.FreeIPAAccountState.Error.values()) {
        if ((e.getCode()) == code) {
            return e;
        }
    }
    if ((org.ldaptive.ResultCode.valueOf(code)) == (org.ldaptive.ResultCode.SUCCESS))
        return null;
    else
        return org.ldaptive.auth.ext.FreeIPAAccountState.Error.UNKNOWN;
    
}