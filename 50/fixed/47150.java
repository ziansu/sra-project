@java.lang.Override
void setMethod(@com.flurgle.camerakit.Method
int method) {
    synchronized(this) {
        this.mMethod = method;
    }
}