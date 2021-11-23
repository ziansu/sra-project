@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(this, "Presionó botón Creditos", Toast.LENGTH_SHORT).show();
    olimpiadas.sena.com.olimpiadasmath.util.DialogHelper.showCopyRightDialog(v.getContext());
}