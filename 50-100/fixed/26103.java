public void secondButton(android.view.View view) {
    gnohr.drex.perceptiontest.PerceptionDatum pitchDatum = new gnohr.drex.perceptiontest.PerceptionDatum(0, (!(isFirstStimuliLowerPitchedAndBigger)), firstPitchStimulus, secondPitchStimulus);
    gnohr.drex.perceptiontest.PerceptionDatum sizeDatum = new gnohr.drex.perceptiontest.PerceptionDatum(0, (!(isFirstStimuliLowerPitchedAndBigger)), firstSizeStimulus, secondSizeStimulus);
    PerceptionData.combinedSizeData.addDatum(sizeDatum);
    PerceptionData.combinedPitchData.addDatum(pitchDatum);
    if ((continueSelected) == true) {
        giveStimuliThenQuestions(bv);
    }else {
        android.content.Intent thingy = new android.content.Intent(this, gnohr.drex.perceptiontest.MainActivity.class);
        startActivity(thingy);
    }
}