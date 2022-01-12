public boolean Elimina(int nivel) {
    try {
        hashtab.get(this.nivel).clear();
        hashtab.remove(nivel);
        this.nivel = (this.nivel) - 1;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
    return true;
}