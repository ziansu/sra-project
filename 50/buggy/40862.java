public void addItems(int amount) {
    for (int i = 0; i < amount; i++) {
        items.add(new com.rupik.newstoday.FlipAdapter.Item());
    }
    notifyDataSetChanged();
}