public static java.lang.String palindrom(int num) {
    int temp = num;
    int remainder;
    int reverse = 0;
    while (num > 0) {
        remainder = num % 10;
        reverse = (reverse * 10) + remainder;
        num = num / 10;
    } 
    if (reverse == temp) {
        return temp + " is a Palindrome Number!";
    }else {
        return temp + " is not a Palindrome Number!";
    }
}