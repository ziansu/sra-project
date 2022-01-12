void cleanup(int event) throws java.lang.Exception {
    if (quit)
        return ;
    
    quit = true;
    update(null);
    redirect(0);
    sendEvent(event);
    link.close();
}