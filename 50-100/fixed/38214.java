private void MakeSecondHttpRequest(java.lang.String id) {
    for (int i = 0; i < (filesStream.length); i++) {
        java.io.File file = new java.io.File(filesPath[i]);
        com.gestion.textlater.textlater.EnviarMensajeActivity.nameID = id;
        android.util.Log.e("id:", com.gestion.textlater.textlater.EnviarMensajeActivity.nameID);
        android.util.Log.e("NAME FILE:", file.getName());
        new com.gestion.textlater.textlater.EnviarMensajeActivity.RetrieveFeedTask().execute(file);
    }
}