public edu.ycp.cs.funwithsound.Strike p(float beat, int velocity) {
    edu.ycp.cs.funwithsound.Strike strike = new edu.ycp.cs.funwithsound.Strike();
    strike.setStartUs(tempo.beatToUs(beat));
    strike.setDurationUs((1000000L / 200L));
    strike.setVelocity(velocity);
    return strike;
}