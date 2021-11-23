public boolean isValidContribution(java.lang.String contribution) {
    return (this.wordCount(contribution)) <= 100 ? true : false;
}