public int changePosition(int pos) {
    try {
        if (pos < (currentPos))
            refresh();
        
        while ((currentPos) < pos)
            if (!(skipFrame()))
                break;
            
        
    } catch (ledcubeproject.models.musicprocessor.decoder.BitstreamException e) {
        e.printStackTrace();
    }
    return currentPos;
}