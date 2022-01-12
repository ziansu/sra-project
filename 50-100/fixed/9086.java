public void update() {
    progress1.setTextProgress(b.getPayout().toString());
    buyButton.setText((((((b.getName()) + ":") + (b.getNumOfBuildings().toString())) + "\nBuy:") + (b.getPrice().toString())));
}