@java.lang.Override
public void setProgress(int p) {
    if ((p >= 0) && (p <= 100)) {
        setAttr("progress", java.lang.Integer.toString(p));
    }
}