@java.lang.Override
public void write(java.nio.FloatBuffer buffer) {
    for (int i = 0; i < 4; i++)
        for (int j = 0; j < 4; j++)
            buffer.put(get(i, j));
        
    
}