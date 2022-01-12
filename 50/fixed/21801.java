public void start() {
    for (br.unicamp.cst.core.entities.Codelet co : this.getAllCodelets()) {
        synchronized(co) {
            co.start();
        }
    }
}