@java.lang.Override
public void rotate() {
    int by = ((com.youtoolife.labyrinth.chunk.Chunk.SIZE) - 1) - (x);
    int bx = y;
    y = by;
    x = bx;
    for (com.youtoolife.labyrinth.events.ActionEvent e : events)
        e.rotate();
    
    (rotates)++;
}