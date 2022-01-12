public void connect(java.lang.String type) {
    if (this.connect = true) {
        java.lang.System.out.println("Channel had been connected");
    }else {
        this.connect = true;
        switch (type.toUpperCase()) {
            case "EYE" :
                sens = new Chronotimer.EYE(this.ChNum);
                break;
            case "GATE" :
                sens = new Chronotimer.GATE(this.ChNum);
                break;
            case "PAD" :
                sens = new Chronotimer.PAD(this.ChNum);
                break;
        }
        java.lang.System.out.println("Channel connected");
    }
}