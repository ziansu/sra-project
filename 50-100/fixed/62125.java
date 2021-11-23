public void setTempAnimalMessage(java.lang.String msg, int time) {
    if ((animalMessage) != msg) {
        android.os.Handler handler = new android.os.Handler();
        this.lastMsg = animalMessage;
        setAnimalMessage(msg, true);
        handler.postDelayed(new java.lang.Runnable() {
            public void run() {
                setAnimalMessage(lastMsg, true);
            }
        }, time);
    }
}