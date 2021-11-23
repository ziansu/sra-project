@java.lang.Override
public void sendData(float currentFreq, float noteFreq) {
    com.awaj.activities.GuitarTuner.GuitarTunerMeterView.currentNoteFrequency = noteFreq;
    com.awaj.activities.GuitarTuner.GuitarTunerMeterView.currentFrequency = currentFreq;
}