public boolean applyGuess(int guess) {
    if (guess > (mMaxObjects)) {
        throw new java.lang.IllegalArgumentException("The jar's not that big - try a smaller number! ");
    }else
        if (guess < 1) {
            throw new java.lang.IllegalArgumentException("Very funny - please guess a positive number.");
        }
    
    mIsCorrect = (mObjectsInJar) == guess;
    return mIsCorrect;
}