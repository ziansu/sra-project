public void marcarAsistencia(android.view.View v) {
    progressBar.setVisibility(View.VISIBLE);
    arqrifa.org.arquitecturarifamobile.layout.AsistenciaActivity.mCommandService = DeviceListActivity.mCommandService;
    arqrifa.org.arquitecturarifamobile.layout.AsistenciaActivity.mCommandService.write(java.lang.String.valueOf(usuario.getCi()));
    accionMarcar = true;
    android.content.Intent intent = new android.content.Intent(this, arqrifa.org.arquitecturarifamobile.layout.SplashAsistenciaActivity.class);
    startActivity(intent);
    new arqrifa.org.arquitecturarifamobile.layout.AsistenciaActivity.ReunionActualTask(this).execute(usuario.getGeneracion());
}