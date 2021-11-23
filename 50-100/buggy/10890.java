@java.lang.Override
public int makeMove() {
    java.util.Scanner keyboard = new java.util.Scanner(java.lang.System.in);
    int input = 0;
    java.lang.System.out.println("Make your move (1)Hit or (2)Stay ");
    do {
        try {
            input = keyboard.nextInt();
        } catch (java.util.InputMismatchException e) {
        }
    } while ((input < 1) || (input > 2) );
    keyboard.close();
    return input;
}