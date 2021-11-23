public void onItemClick(int mPosition, int j) {
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.nectar.thesun.ReadActivity.class);
    i.putExtra("listname", j);
    if (j == 0) {
        mPosition = MyConstants.homenews.get(mPosition).getPageid();
    }
    i.putExtra("position", mPosition);
    startActivity(i);
    finish();
}