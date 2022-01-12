public void onCambioProvincia() {
    if (((provincia) != null) && (!(provincia.equals("")))) {
        localidades = provinciaGetLocalidades(provincia);
    }else {
        localidades = new java.util.ArrayList<>();
    }
}