@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.isen.twinmaxapk.HistoricActivity.class);
    final android.os.Bundle extras = new android.os.Bundle();
    extras.putInt(Constants.GOTOHISTORIC, 0);
    intent.putExtras(extras);
    startActivity(intent);
}