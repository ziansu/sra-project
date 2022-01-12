private int findRandomInstance() {
    int random_instance = ((int) ((java.lang.Math.random()) * (used.length)));
    while (used[random_instance]) {
        random_instance++;
        if (random_instance > (used.length))
            random_instance = 0;
        
    } 
    used[random_instance] = true;
    return random_instance;
}