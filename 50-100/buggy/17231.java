@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.i("test", java.lang.String.valueOf(((getAdapterPosition()) + ", has been pressed")));
    if ((v.getId()) == (key.getId())) {
        new cs2340.gatech.edu.brodents.RatSelected(java.lang.Integer.valueOf(getAdapterPosition()));
        android.content.Intent indDataPage = new android.content.Intent(a.getApplicationContext(), cs2340.gatech.edu.brodents.indDataPageActivity.class);
        a.startActivity(indDataPage);
    }
}