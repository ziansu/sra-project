public int calculateInputSize(java.lang.Object[] params) {
    android.util.Log.d("teste", "Entrei no metodo");
    int resp = 0;
    for (int i = 0; i < (params.length); i++) {
        if ((params[i]) instanceof byte[]) {
            resp += ((byte[]) (params[i])).length;
        }
    }
    resp /= 1024;
    return resp;
}