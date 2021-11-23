@java.lang.Override
public void rotate() {
    int by = x;
    int bx = ((com.youtoolife.labyrinth.chunk.Chunk.SIZE) - 1) - (y);
    y = by;
    x = bx;
    for (com.youtoolife.labyrinth.events.ActionEvent e : events)
        e.rotate();
    
    (rotates)++;
}