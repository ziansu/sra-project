public boolean guess(int guessNumber) {
    if (guessNumber == (secretNumber)) {
        this.hint = "Correct.  The secret number is " + (secretNumber);
        return true;
    }else
        if (guessNumber > (secretNumber)) {
            this.hint = "Sorry, your guess is too big";
            return false;
        }else {
            this.hint = "Sorry, your guess is too small";
            return false;
        }
    
}