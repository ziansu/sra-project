public void run() {
    if (this.alg_type.equals("IDS")) {
        this.writeStringToFile(this.runIDS(), "output.txt");
    }else {
        this.writeStringToFile(this.runUCS(), "output.txt");
    }
}