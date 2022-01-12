public void run() {
    while (true) {
        if (!(this.getSpiroModel().isStop())) {
            this.getSpiroModel().updateByAnimation();
            this.getSpiroModel().setDegree();
        }
        this.update();
        try {
            java.lang.Thread.sleep(1);
        } catch (java.lang.Exception anException) {
        }
    } 
}