public double getDeltaR(competition.richmario.StateAction previous, float reward, competition.richmario.StateAction next) {
    double deltaR = reward;
    deltaR -= getQ(previous);
    return deltaR;
}