Sim.Message popMsg() {
    if ((buffered) > 0) {
        Sim.Message first = buffer[0];
        for (int i = 0; (i < (buffered)) && (i < ((bufferSize) - 1)); i++) {
            buffer[i] = buffer[(i + 1)];
        }
        (buffered)--;
        return first;
    }else
        return null;
    
}