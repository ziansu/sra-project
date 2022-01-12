@java.lang.Override
public void onError(org.cny.awf.net.http.CBase c, java.lang.Throwable err) throws java.lang.Exception {
    if ((this.file) != null) {
        this.file.clear();
    }
    this.h.onError(c, err);
}