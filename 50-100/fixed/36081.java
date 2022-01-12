@java.lang.Override
protected void onPostExecute(java.lang.Boolean o) {
    super.onPostExecute(o);
    if (o) {
        android.widget.Toast.makeText(contexto, ("archivo trasferido !!!" + o), Toast.LENGTH_SHORT).show();
        ac.progressBar.setProgress(0);
        ac.text_Bytes.setText("Transmision Finalizada");
    }else {
        android.widget.Toast.makeText(contexto, ("no se pudo transmitir" + o), Toast.LENGTH_SHORT).show();
    }
}