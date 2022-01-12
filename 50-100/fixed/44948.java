private static void test2dot2(int typeOfInput) {
    double period = 1.96;
    double waveHeight = 0.032;
    double depth = 0.78;
    double dout = 0.03;
    double gp1 = 0.0;
    double gp2 = 4;
    double gp3 = 19.0;
    double gp4 = ((uk.co.cranfield.common.Constants.IX) - 1) * (uk.co.cranfield.common.Constants.DX);
    uk.co.cranfield.core.WaveSimulatorSolver solver2 = new uk.co.cranfield.core.WaveSimulatorSolver(typeOfInput, period, waveHeight, depth, dout, gp1, gp2, gp3, gp4);
    solver2.solve();
}