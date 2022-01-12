@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), android.trikarya.sales_hisamitsu.DetailOutlet.class);
    intent.putExtra("kd_outlet", currentOutlet.getKode());
    startActivity(intent);
}