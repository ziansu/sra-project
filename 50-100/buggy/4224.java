public void eat(int food) {
    eaten += ((1 + (respeff)) > 1) ? random.nextInt(((respeff) / 2)) : 0;
    food *= (20 + (random.nextInt(31))) + (digeff);
    food /= 100;
    this.regenerate((food / 20));
    this.weight += food;
}