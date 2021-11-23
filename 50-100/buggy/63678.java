public boolean Elimina(int nivel) {
    try {
        hashtab.get(nivel).clear();
        hashtab.remove(nivel);
        (this.nivel)--;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
    return true;
}