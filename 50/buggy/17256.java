public void downPressed() {
    (selectedOption)++;
    selectedOption = java.lang.Math.abs(selectedOption);
    selectedOption %= options.size();
}