public void close() {
    if ((this.br) != null) {
        try {
            this.br.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}