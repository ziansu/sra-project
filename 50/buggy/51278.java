public synchronized void init(javax.servlet.ServletContext context) {
    if ((this.velocityEngine) == null) {
        this.velocityEngine = this.newVelocityEngine(context);
    }
    this.initToolbox(context);
}