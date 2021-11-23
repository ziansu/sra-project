public void run() {
    while (true) {
        if (!(this.getSpiroModel().isStop())) {
            this.getSpiroModel().updateByAnimation();
            this.getSpiroModel().setDegree();
        }else {
        }
        this.update();
        try {
            java.lang.Thread.sleep(1);
        } catch (java.lang.Exception anException) {
        }
    } 
}