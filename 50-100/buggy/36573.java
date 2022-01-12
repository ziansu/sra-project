public edu.ycp.cs.funwithsound.Strike s(float beat, float duration, int velocity) {
    edu.ycp.cs.funwithsound.Strike strike = new edu.ycp.cs.funwithsound.Strike();
    strike.setStartUs(tempo.beatToUs(beat));
    strike.setDurationUs(tempo.beatToUs(duration));
    strike.setVelocity(velocity);
    return strike;
}