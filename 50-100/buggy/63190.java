public boolean userWin(int number) {
    if (number != (secretNumber)) {
        if (number > (secretNumber)) {
            max = --number;
        }else {
            min = ++number;
        }
        statistics.add(number);
        return false;
    }else {
        return true;
    }
}