private java.lang.String[] getTime(int duration) {
    int seconds = duration / 1000;
    int minutes = seconds / 60;
    seconds = seconds % 60;
    java.lang.String minutesString = (minutes < 10) ? "0" + minutes : "" + minutes;
    java.lang.String secondString = (seconds < 10) ? "0" + seconds : "" + seconds;
    return new java.lang.String[]{ minutesString , secondString };
}