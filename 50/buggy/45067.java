@java.lang.Override
public void run() {
    if (moving) {
        xPos -= 5;
        if ((xPos) < (-100))
            stop();
        
        handler.postDelayed(this, 10);
    }
}