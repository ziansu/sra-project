public static void main(java.lang.String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Odd Integer you want to check is Prime:");
    java.lang.String inputN = scanner.nextLine();
    scanner.close();
    java.lang.System.out.println(((("Choose a random Integer such that it's greater " + "than 1 and less than (") + inputN) + " minus one):"));
    java.lang.String inputA = scanner.nextLine();
    MillerRabinPrimeTest test = new MillerRabinPrimeTest(inputN, inputA);
    test.run();
}