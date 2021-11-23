@java.lang.Override
protected void onResume() {
    super.onResume();
    if (processing.core.PApplet.DEBUG)
        java.lang.System.out.println("PApplet.onResume() called");
    
    paused = false;
    handleMethods("resume");
    resume();
}