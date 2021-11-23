public void run() {
    while ((java.lang.Integer.parseInt(movieTime)) > 0) {
        java.lang.String message = ((movieName) + "/Time left: ") + (notifyObservers(movieTime));
        new CountdownDisplay().handleTime(message);
    } 
}