private void start(java.util.List<java.lang.String> words) {
    this.started = true;
    if ((words.size()) > 1) {
        if ((this.id) == (new java.lang.Integer(words.get(1)).intValue()))
            this.lock = false;
        
    }else
        this.lock = false;
    
    java.lang.System.out.println("Go !!!");
}