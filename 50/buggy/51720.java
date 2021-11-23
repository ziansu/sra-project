public void setRainySpeed() {
    java.util.Random randomNumber = new java.util.Random();
    int randomSpeed = (randomNumber.nextInt(((50 - 5) + 1))) + 5;
    this.normalSpeed -= randomSpeed;
}