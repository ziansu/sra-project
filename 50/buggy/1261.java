@java.lang.Override
public void onClick(android.view.View v) {
    new com.example.buzalo.OneProductActivity.BuyProduct().execute();
    android.widget.Toast.makeText(this, "Спасибо за покупку", Toast.LENGTH_SHORT).show();
}