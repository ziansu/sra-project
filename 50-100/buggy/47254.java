private void setPlayerColor(int player) {
    for (int i = 0; i < 3; i++) {
        if (player == i)
            playerTextViews[i].setBackgroundColor(android.graphics.Color.parseColor("#8866FF7A"));
        else
            playerTextViews[i].setBackgroundColor(android.graphics.Color.parseColor("#0066FF7A"));
        
    }
}