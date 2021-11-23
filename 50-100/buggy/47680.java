public void updateTimeIndicator() {
    try {
        if ((gameStart.getTime()) == 0)
            com.brainicism.projectrito.MainActivity.gameProgression.setImageResource(R.drawable.grey_dot);
        else
            if ((com.brainicism.projectrito.MainActivity.currGameTime) < 900)
                com.brainicism.projectrito.MainActivity.gameProgression.setImageResource(R.drawable.green_dot);
            else
                if ((com.brainicism.projectrito.MainActivity.currGameTime) < 1800)
                    com.brainicism.projectrito.MainActivity.gameProgression.setImageResource(R.drawable.yellow_dot);
                else
                    if ((com.brainicism.projectrito.MainActivity.currGameTime) >= 1800)
                        com.brainicism.projectrito.MainActivity.gameProgression.setImageResource(R.drawable.red_dot);
                    
                
            
        
    } catch (java.lang.NullPointerException e) {
        e.printStackTrace();
    }
}