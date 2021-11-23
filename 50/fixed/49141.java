@java.lang.Override
public void onExecErr(org.cny.awf.net.http.CBase c, java.lang.Throwable e) {
    if ((this.file) != null) {
        this.file.clear();
    }
    this.h.onExecErr(c, e);
}