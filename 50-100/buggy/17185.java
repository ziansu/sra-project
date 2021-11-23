@java.lang.Override
public void run() {
    boolean moved = MoveShape(DOWN_DIRECTION, currentShape);
    if (!moved) {
        boolean created = CreateShape();
        Check();
        if (!created)
            gameInProgess = false;
        
    }
    handler.post(new java.lang.Runnable() {
        public void run() {
            PaintMatrix();
            if (!(gameInProgess))
                cancel();
            
        }
    });
}