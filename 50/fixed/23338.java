private void guardarFireBase() {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String miGestorJSON = gson.toJson(gestor, modelo.modelo.paciente.GestionPaciente.class);
    firebase.setValue(miGestorJSON);
}