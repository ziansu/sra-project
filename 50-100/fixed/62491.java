private void playAudio() {
    com.utmostapp.freqtionary.Word currentWord = this.wordChooser.getCurrentWord();
    if (this.isTopShown)
        currentWord.foreignAudio(getActivity(), this.audioPlayer);
    else
        currentWord.nativeAudio(getActivity(), this.audioPlayer);
    
}