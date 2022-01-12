@java.lang.Override
public void tick() {
    if ((targetinView()) && ((this.player) != null)) {
        randomlyMoveinRange();
    }else
        if ((player) == null) {
            randomlyMoveinRange();
        }else {
            follow();
        }
    
}