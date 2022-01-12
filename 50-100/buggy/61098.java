public void altaInscripcionNormal(int numero, boolean estado, java.lang.String clases) {
    java.util.Vector<models.Actividad> cl = app.Utiles.convertStringToClases(clases);
    models.Normal inscripcionNormal = new models.Normal(estado, numero, cl);
    inscripcionNormal.insert();
    inscripcionesNormales.add(inscripcionNormal);
}