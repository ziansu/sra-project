@java.lang.Override
public void onResume() {
    super.onResume();
    if (processing.core.PApplet.DEBUG)
        java.lang.System.out.println("PApplet.onResume() called");
    
    paused = false;
    handleMethods("resume");
    resume();
}