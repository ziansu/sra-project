public void stop() {
    showUnvisited = true;
    pause();
    timeline = null;
    redraw();
    if ((gifWriter) != null)
        gifWriter.close();
    
}