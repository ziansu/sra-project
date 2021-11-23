public int solution(java.lang.String S) {
    int result = 1;
    int leftNum = 0;
    for (char c : S.toCharArray()) {
        if (c == '(') {
            leftNum++;
        }else {
            leftNum--;
        }
        if (leftNum < 0) {
            result = 0;
            break;
        }
    }
    return result;
}