public void update() {
    progress1.setTextProgress(b.getPayout().toEngineeringString());
    buyButton.setText((((((b.getName()) + ":") + (b.getNumOfBuildings().toEngineeringString())) + "\nBuy:") + (b.getPrice().toEngineeringString())));
}