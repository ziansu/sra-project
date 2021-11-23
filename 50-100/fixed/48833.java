public void agregarProcesos(int orden) {
    jPanel1.removeAll();
    java.util.Collections.sort(tareas, new servidor.OrdenarTareas(orden));
    for (java.lang.String[] dato : tareas) {
        jPanel1.add(new interfaz.proceso(dato[3], dato[0], dato[1], dato[2], ip));
    }
    this.updateUI();
    jPanel1.updateUI();
    jScrollPane1.updateUI();
}