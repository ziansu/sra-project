@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    for (com.firebase.client.DataSnapshot postSnapshot : snapshot.getChildren()) {
        com.example.andres_bonilla.ensayo.activity.classes.MarketProduct marketProduct = postSnapshot.getValue(com.example.andres_bonilla.ensayo.activity.classes.MarketProduct.class);
        if (marketProduct.getNombre().equals(nombreProductoSpinner)) {
            stringImagenFirebase = marketProduct.getImagen();
            precioProducto = marketProduct.getPrecio();
        }
    }
}