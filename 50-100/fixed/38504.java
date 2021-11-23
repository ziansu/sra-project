public bestsummarydevelopment.SentenceGenome getNext() {
    if ((this.currentIndex) == ((this.popSize) - 1)) {
        this.Update();
        this.currentIndex = 0;
    }
    (this.currentIndex)++;
    return this.population.get(((currentIndex) - 1));
}