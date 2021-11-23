@java.lang.Override
public void onClick(android.view.View arg0) {
    android.content.Intent intent = new android.content.Intent(context, edu.washington.prathh.change.Payment_Step2.class);
    intent.putExtra("amount", editText.getText().toString());
    startActivity(intent);
}