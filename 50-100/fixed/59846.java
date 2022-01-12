public static void main(java.lang.String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Odd Integer you want to check is Prime:");
    java.lang.String inputN = scanner.nextLine();
    java.lang.System.out.println(((("Choose a random Integer such that it's greater " + "than 1 and less than (") + inputN) + " minus one):"));
    java.lang.String inputA = scanner.nextLine();
    scanner.close();
    MillerRabinPrimeTest test = new MillerRabinPrimeTest(inputN, inputA);
    java.lang.System.out.println(test.run());
}