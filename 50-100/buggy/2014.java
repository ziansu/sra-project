public int bounds(int input, int high) {
    java.lang.System.out.print((input + " "));
    if ((input >= 0) && (input < high)) {
        return input;
    }else
        if (input >= 0) {
            return 0;
        }else {
            return high - 1;
        }
    
}