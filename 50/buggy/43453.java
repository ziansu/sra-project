public void setPoints(int amount) {
    if ((points) > 100) {
        points = 100;
    }else {
        points = (points) - amount;
    }
}