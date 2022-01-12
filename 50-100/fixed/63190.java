public boolean userWin(int number) {
    statistics.add(number);
    if (number != (secretNumber)) {
        if (number > (secretNumber)) {
            max = --number;
        }else {
            min = ++number;
        }
        return false;
    }else {
        return true;
    }
}