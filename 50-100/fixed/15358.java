public void setMacros(int fat, int carbs, int protein) {
    this.fat = ((calories) * fat) / 100;
    this.carbs = ((calories) * carbs) / 100;
    this.protein = ((calories) * protein) / 100;
}