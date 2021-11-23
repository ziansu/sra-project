public static boolean affirmative(java.util.Scanner kb) {
    java.lang.String x = kb.nextLine().toLowerCase().trim();
    if ((((((x.equals("yes")) || (x.equals("y"))) || (x.equals("sure"))) || (x.equals("yeah"))) || (x.equals("yeah"))) || (x.equals("why not?")))
        return true;
    else
        return false;
    
}