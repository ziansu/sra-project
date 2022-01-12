private int dmg() throws java.io.FileNotFoundException {
    java.lang.String a;
    java.lang.String b;
    int counter = 1;
    java.util.Scanner input = new java.util.Scanner(new java.io.File("conf/thechosenone.txt"));
    a = input.nextLine();
    while (input.nextLine().equals(a)) {
        counter++;
    } 
    return counter;
}