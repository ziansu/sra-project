public void deleteBonus() {
    deleteArray(foodInBonus);
    matrix[xFood][yFood].setIcon(null);
    createFood();
}