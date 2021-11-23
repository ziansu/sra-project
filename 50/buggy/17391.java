public void carregaImagem(java.lang.String localArquivoFoto) {
    android.graphics.Bitmap imagemFoto = android.graphics.BitmapFactory.decodeFile(localArquivoFoto);
    usuario.setPathFoto(localArquivoFoto);
}