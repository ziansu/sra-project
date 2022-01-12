private int getDoubleRandomFloor(int low, int high) {
    int number = (r.nextInt((high - low))) + low;
    while ((number == (specs.getSkylobbyfloor())) || (number == ((specs.getSkylobbyfloor()) + 1))) {
        number = (r.nextInt((high - low))) + low;
    } 
    if (number == 1) {
        number = 0;
    }
    return number;
}