@java.lang.Override
public void onClick(android.view.View v) {
    if (!(comprobador1)) {
        android.widget.Toast.makeText(this, "Seleccione La fecha", Toast.LENGTH_SHORT).show();
    }
    if (!(comprobador2)) {
        android.widget.Toast.makeText(this, "Seleccione La Cantidad de Días", Toast.LENGTH_SHORT).show();
    }
}