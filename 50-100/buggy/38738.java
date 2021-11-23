public static int setHours(boolean isMilitary) {
    int maxHours = (isMilitary) ? 23 : 12;
    java.lang.System.out.print("Set the hours: ");
    java.util.Scanner hoursInput = new java.util.Scanner(java.lang.System.in);
    int hours = hoursInput.nextInt();
    while (((hours == 0) && (isMilitary == false)) || ((hours < 1) || (hours > maxHours))) {
        java.lang.System.out.print("Invalid entry.  Input the hours: ");
        hours = hoursInput.nextInt();
    } 
    return hours;
}