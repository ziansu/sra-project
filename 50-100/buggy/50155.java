private char checkNull(int _randomNum) {
    char result = 'Y';
    switch (_randomNum % 4) {
        case 1 :
            result = up;
        case 2 :
            result = down;
        case 3 :
            result = left;
        case 4 :
            result = right;
    }
    return result;
}