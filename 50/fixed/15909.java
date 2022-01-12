boolean is_Prime(int x) {
    boolean answer = true;
    for (int dividing = 2; dividing < x; dividing++)
        if ((x % dividing) == 0) {
            answer = false;
            break;
        }
    
    return answer;
}