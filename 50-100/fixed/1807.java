public java.lang.String inputOutside(java.util.Scanner sc) {
    java.lang.String line = sc.nextLine();
    if ((!(line.equals("h"))) && (!(line.equals("a")))) {
        line = "Wrong Input!";
    }
    return line;
}