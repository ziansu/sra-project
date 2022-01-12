public static org.ldaptive.auth.ext.FreeIPAAccountState.Error valueOf(final int code) {
    for (org.ldaptive.auth.ext.FreeIPAAccountState.Error e : org.ldaptive.auth.ext.FreeIPAAccountState.Error.values()) {
        if ((e.getCode()) == code) {
            return e;
        }
    }
    return (org.ldaptive.ResultCode.valueOf(code)) == (org.ldaptive.ResultCode.SUCCESS) ? null : org.ldaptive.auth.ext.FreeIPAAccountState.Error.UNKNOWN;
}