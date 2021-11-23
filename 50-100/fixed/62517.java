public static int setSeconds() {
    java.lang.System.out.print("Set the seconds: ");
    java.util.Scanner secondsInput = new java.util.Scanner(java.lang.System.in);
    int seconds = secondsInput.nextInt();
    while ((seconds < 0) || (seconds > 59)) {
        java.lang.System.out.print("Invalid entry.  Input the seconds: ");
        seconds = secondsInput.nextInt();
    } 
    return seconds;
}