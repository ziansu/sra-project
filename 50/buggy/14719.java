public void change(int amount) {
    if (amount < 0) {
        takeAway(amount);
    }else
        if (amount > 0) {
            add(amount);
        }
    
}