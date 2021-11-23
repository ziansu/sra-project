public void addPoints() {
    switch (difficulty) {
        case 0 :
            score += 10;
        case 1 :
            score += 25;
            break;
        case 2 :
            score += 50;
            break;
        case 3 :
            score += 100;
            break;
    }
}