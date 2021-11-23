public static void main(java.lang.String... args) {
    int runs = 1;
    java.lang.String paramDir = args[0];
    java.lang.String specificParamDir = args[1];
    playground.michalm.taxi.run.TaxiLauncherParams params = playground.michalm.taxi.run.TaxiLauncherParams.readParams(paramDir, specificParamDir);
    playground.michalm.taxi.run.MultiRunTaxiLauncher.run(runs, params);
}