public int showFingers() {
    java.lang.System.out.print(((this.name) + ", please choose a number of fingers to show between 1 and 10. Type 0 to quit: "));
    int fingers = sc.nextInt();
    while ((fingers < 0) || (fingers > (this.maxFingers))) {
        java.lang.System.out.print((fingers + " is not a valid number; please retry with a number between 1 and 10 or 0 to quit: "));
        fingers = sc.nextInt();
    } 
    this.setFingers(fingers);
    return fingers;
}