private void editOrder() {
    android.content.Intent intent = new android.content.Intent(this, tagClass);
    intent.putExtras(newBundle);
    intent.putExtra("class", "order");
    intent.putExtra("oid", bundle.getString("oid"));
    intent.putExtra("special", isAccepted);
    startActivity(intent);
    overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
}