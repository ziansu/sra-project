public static void main(java.lang.String[] args) {
    int n = 0;
    if ((args.length) == 1) {
        n = java.lang.Integer.parseInt(args[0]);
    }else {
        java.lang.System.out.println("Bis zu welcher oberen Grenze sollen Primzahlen berechnet werden?");
        java.lang.String input = java.lang.System.console().readLine();
        n = java.lang.Integer.parseInt(input);
    }
    SiebDesEratosthenes sde = new SiebDesEratosthenes(n);
}