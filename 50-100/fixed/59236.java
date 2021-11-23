void launchSPL() throws java.io.IOException {
    java.lang.System.out.println("--Masukkan Data--");
    int jmlVariabel = inputReader.nextInt();
    int jmlPersamaan = inputReader.nextInt();
    java.lang.System.out.println("--Masukkan Data--");
    SistemPersamaanLinear sistemPersamaanLinear = new SistemPersamaanLinear(jmlVariabel, jmlPersamaan);
    sistemPersamaanLinear.read(inputReader);
    java.lang.System.out.println("--Masukkan Data--");
    sistemPersamaanLinear.solve();
    java.lang.System.out.println("---SISTEM PERSAMAAN LINEAR---");
    sistemPersamaanLinear.write(outputWriter);
}