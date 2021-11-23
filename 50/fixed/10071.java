public void subKarma(int karmaAmount) {
    if (karmaAmount > (mKarma)) {
        mKarma = 0;
    }else {
        mKarma -= karmaAmount;
    }
}