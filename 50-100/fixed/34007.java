public static void main(java.lang.String[] args) {
    StackArray myList = new StackArray();
    java.lang.System.out.println("Enter the name of the file");
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String fileName = scanner.nextLine();
    DataReader obj = new DataReader(fileName, myList);
    StackArray aaa = new StackArray();
    java.lang.System.out.println(myList);
}