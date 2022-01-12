public void setYear(int year) {
    if ((((int) (java.lang.Math.log10(year))) + 1) > (ID3Tag.Id3TagMp3.MAXLENGTHYEAR)) {
        this.year = java.lang.Integer.parseInt(java.lang.String.valueOf(year).substring(0, ID3Tag.Id3TagMp3.MAXLENGTHYEAR));
    }
    this.year = java.lang.Integer.parseInt(ID3Tag.Id3TagMp3.fixYearLen(java.lang.String.valueOf(year)));
}