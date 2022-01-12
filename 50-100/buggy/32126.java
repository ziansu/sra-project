private coyote.dataframe.DataFrame sanitize(coyote.dataframe.DataFrame frame) {
    coyote.dataframe.DataFrame retval = ((coyote.dataframe.DataFrame) (this.clone()));
    if (retval.contains(coyote.dx.ftp.RemoteSite.PASS_FIELD)) {
        retval.put(coyote.dx.ftp.RemoteSite.PASS_FIELD, "-HIDDEN-");
    }
    if (retval.contains(coyote.dx.ftp.RemoteSite.PROXY_PASS_FIELD)) {
        retval.put(coyote.dx.ftp.RemoteSite.PROXY_PASS_FIELD, "-HIDDEN-");
    }
    return retval;
}