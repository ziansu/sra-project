@java.lang.Override
public uk.ac.ox.cs.sokobanexam.model.DefaultMaze clone() {
    uk.ac.ox.cs.sokobanexam.model.DefaultMaze clone = new uk.ac.ox.cs.sokobanexam.model.DefaultMaze(getWidth(), getHeight());
    for (int y = 0; y < (getHeight()); y++)
        java.lang.System.arraycopy(mMap, 0, clone.mMap, 0, getWidth());
    
    return clone;
}