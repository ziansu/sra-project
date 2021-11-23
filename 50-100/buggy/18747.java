public void changePosition(int pos) {
    try {
        if (pos < (currentPos))
            refresh();
        else
            while ((currentPos) < pos)
                if (!(skipFrame()))
                    break;
                
            
        
    } catch (ledcubeproject.models.musicprocessor.decoder.BitstreamException e) {
        e.printStackTrace();
    }
}