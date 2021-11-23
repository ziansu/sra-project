private void previousButtonSetVisibility(boolean show) {
    com.example.sw802f15.tempoplayer.MusicPlayerGUI.CircleButton.CircleButton button = ((com.example.sw802f15.tempoplayer.MusicPlayerGUI.CircleButton.CircleButton) (com.example.sw802f15.tempoplayer.MusicPlayer.Initializers._activity.findViewById(R.id.previousButton)));
    if (show) {
        button.setAlpha(1.0F);
        button.setEnabled(true);
    }else
        if (com.example.sw802f15.tempoplayer.MusicPlayer.DynamicQueue.getInstance(com.example.sw802f15.tempoplayer.MusicPlayer.Initializers._activity).prevSongsIsEmpty()) {
            button.setAlpha(0.3F);
            button.setEnabled(false);
        }
    
}