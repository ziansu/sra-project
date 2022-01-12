@java.lang.Override
public void noteOn(double frequency, double amplitude, com.softsynth.shared.time.TimeStamp timeStamp) {
    freqAdder.inputA.set(frequency, timeStamp);
    ampEnv.input.on(timeStamp);
}