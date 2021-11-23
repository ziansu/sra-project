private char checkNull(int _randomNum) {
    char result = 'Y';
    switch (_randomNum % 4) {
        case 0 :
            result = up;
        case 1 :
            result = down;
        case 2 :
            result = left;
        case 3 :
            result = right;
    }
    return result;
}