@java.lang.Override
protected void onPostExecute(android.util.Pair<java.lang.String, java.util.List<java.lang.String>> result) {
    if (result == null) {
        android.content.Intent i = new android.content.Intent(this, com.tecpro.buseslep.Dialog.class);
        i.putExtra("message", "Error al mostrar asientos");
        startActivity(i);
    }else {
        imgAdapter = new com.tecpro.buseslep.ImageAdapter(context, seats, gridview);
        gridview.setAdapter(imgAdapter);
    }
    pdLoading.dismiss();
}