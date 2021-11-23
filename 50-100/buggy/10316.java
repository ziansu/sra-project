@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.historicar.app.bean.Carro carro = carros.get(position);
    android.content.Intent myIntent = new android.content.Intent(ctx, com.historicar.app.activity.ResultActivity.class);
    myIntent.putExtra(Constants.PLACA_KEY, carro.getPlaca().replaceAll(" - ", ""));
    startActivity(myIntent);
}