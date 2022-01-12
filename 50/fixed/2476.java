public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, edu.weber.housing1000.ClientInfoActivity.class);
    intent.putExtras(getIntent());
    startActivity(intent);
}