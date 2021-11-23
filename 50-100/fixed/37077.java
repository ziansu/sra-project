@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (org.dev4u.hv.guia3_ejemplo.MainActivity.GUARDADO)) {
        if (data == null)
            return ;
        
        org.dev4u.hv.guia3_ejemplo.Contacto c = new org.dev4u.hv.guia3_ejemplo.Contacto(data.getStringExtra("NOMBRE"), data.getStringExtra("NUMERO"));
        contactosArrayList.add(c);
        adaptadorContacto.notifyDataSetChanged();
    }
}