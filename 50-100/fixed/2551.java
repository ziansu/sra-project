private void difficultyWordResult(java.lang.String[] words) {
    for (java.lang.String word : words) {
        switch (word.toUpperCase()) {
            case "EASY" :
                difficulty = 3;
                playSound("YourFirstWord", yourWordIsCompletion);
                STATUS = me.ianhenry.wordladder.MainActivity.Status.GAME;
                break;
            case "MEDIUM" :
                difficulty = 4;
                playSound("YourFirstWord", yourWordIsCompletion);
                STATUS = me.ianhenry.wordladder.MainActivity.Status.GAME;
                break;
            case "HARD" :
                difficulty = 5;
                playSound("YourFirstWord", yourWordIsCompletion);
                STATUS = me.ianhenry.wordladder.MainActivity.Status.GAME;
                break;
        }
    }
    listening = false;
}