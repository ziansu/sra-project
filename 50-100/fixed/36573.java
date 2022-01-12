public edu.ycp.cs.funwithsound.Strike s(double beat, double duration, int velocity) {
    edu.ycp.cs.funwithsound.Strike strike = new edu.ycp.cs.funwithsound.Strike();
    strike.setStartUs(tempo.beatToUs(beat));
    strike.setDurationUs(tempo.beatToUs(duration));
    strike.setVelocity(velocity);
    return strike;
}