public boolean guess(int number) {
    if (number == (this.secret)) {
        ++(count);
        setHint((((("Correct! The Secret Number is " + (getSecretNumber())) + ". You used ") + (getCount())) + " guesses"));
        return true;
    }else
        if (number < (this.secret)) {
            setHint("Sorry, your guess is too small");
            (count)++;
            return false;
        }else {
            setHint("Sorry, your guess is too big");
            (count)++;
            return false;
        }
    
}