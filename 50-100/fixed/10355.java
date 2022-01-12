@java.lang.Override
public void run() {
    while (true) {
        if ((application.Controller.getInstance(0).mutexLock) == (!true)) {
            application.Controller.getInstance(0).mutexLock = true;
            application.Controller.getInstance(0).decode();
            application.Controller.getInstance(0).mutexLock = false;
        }
    } 
}