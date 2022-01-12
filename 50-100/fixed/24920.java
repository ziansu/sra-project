public static void main(java.lang.String[] args) {
    int cilindrata = 2000;
    if ((args.length) == 1) {
        try {
            cilindrata = java.lang.Integer.parseInt(args[0]);
        } catch (java.lang.NumberFormatException ex) {
            java.lang.System.out.println("formato errato");
        }
    }
    it.bemyeye.learn.exception.Taxi taxi = new it.bemyeye.learn.exception.Taxi(cilindrata, "WER78MN");
    it.bemyeye.learn.exception.CarApp.stampaImporto(taxi);
}