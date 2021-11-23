public void reset() {
    stopwatch.stopTimer();
    spelInformatie.setTotaalAantalBolletjes(0);
    spelInformatie.reset();
    this.vakjesInhoud.clear();
    for (int i = 0; i < (vakje.length); i++)
        vakje[i] = null;
    
    repaint();
}