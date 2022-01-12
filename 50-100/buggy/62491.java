private void playAudio() {
    com.utmostapp.freqtionary.Word currentWord = this.wordChooser.getCurrentWord();
    if (this.isTopShown)
        currentWord.nativeAudio(getActivity(), this.audioPlayer);
    else
        currentWord.foreignAudio(getActivity(), this.audioPlayer);
    
}