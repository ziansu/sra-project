@java.lang.Override
public void write(java.nio.FloatBuffer buffer) {
    for (int j = 0; j < 4; j++)
        for (int i = 0; i < 4; i++)
            buffer.put(get(i, j));
        
    
}