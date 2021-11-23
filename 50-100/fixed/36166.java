public void clickCard() {
    android.content.Intent intent = new android.content.Intent(this, com.derekcoley.laceup.Card.class);
    intent.putExtra("title", al.get(index));
    intent.putExtra("description", cMap.get(al.get(index)));
    startActivity(intent);
}