@java.lang.Override
public void tick() {
    if ((targetinView()) && ((this.player) != null)) {
        randomlyMoveinRange();
    }else
        if ((player) == null) {
            randomlyMoveinRange();
        }else {
            java.lang.System.out.println("Following");
            follow();
        }
    
}