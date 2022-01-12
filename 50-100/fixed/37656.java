public void nextLine() {
    try {
        this.activeLine = reader.readLine();
        if (!((this.activeLine) == null)) {
            this.activeLine = this.activeLine.trim();
        }
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.getLocalizedMessage());
        e.printStackTrace();
    }
}