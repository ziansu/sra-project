@java.lang.Override
public void onTick(long millisUntilFinished) {
    if (isPaused) {
        cancel();
    }else {
        counter.setText(("" + (millisUntilFinished / 1000)));
        timeRemaining = millisUntilFinished;
        java.lang.String[] array;
        array = new java.lang.String[]{ "Exercise 1" , "Exercise 2" , "Exercise 3" , "Exercise 4" , "Exercise 5" , "Exercise 6" , "Exercise 7" , "Exercise 8" , "Exercise 9" , "Exercice 10" };
        speaking(array);
        textCounting(millisUntilFinished, array);
    }
}