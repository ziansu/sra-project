private com.example.puC.super42.PowerUps.Power randomPowerdownCreator(int i) {
    i = i % 3;
    switch (2) {
        case 1 :
            com.example.puC.super42.PowerUps.PathDecreaser pathdec = new com.example.puC.super42.PowerUps.PathDecreaser(this);
            return pathdec;
        case 2 :
            com.example.puC.super42.PowerUps.BallSpeedIncreaser speedball = new com.example.puC.super42.PowerUps.BallSpeedIncreaser(this);
            return speedball;
        default :
            com.example.puC.super42.PowerUps.BallSizeIncreaser largeball = new com.example.puC.super42.PowerUps.BallSizeIncreaser(this);
            return largeball;
    }
}