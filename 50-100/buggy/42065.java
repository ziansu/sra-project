public void checkAnswer() {
    if ((answer) > (maxNumber)) {
        overGuess();
    }else
        if (((answer) > (fill)) && ((answer) < (maxNumber))) {
            tooHigh();
        }else
            if ((answer) < (fill)) {
                tooLow();
            }
        
    
}