@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (br.com.bhl.superfid.view.MainBluetoothActivity.ENABLE_BLUETOOTH)) {
        if (resultCode == (RESULT_OK)) {
            status.setText("Conectando...");
            startService(new android.content.Intent(this, br.com.bhl.superfid.service.BluetoothDataService.class).putExtra("qrResult", qrResult));
        }else {
            status.setText("Erro ao conectar");
            android.widget.Toast.makeText(getApplicationContext(), "Não foi possível ativar o BT", Toast.LENGTH_SHORT).show();
            cancel();
        }
    }
}