@java.lang.Override
public void notifyTime(double dt) {
    (contador)++;
    if ((contador) > 20) {
        contador = 0;
    }
    if (canDestroy) {
        checkColision();
    }
    this.waveManager.notifyTime(dt);
}