public void score() {
    total = findValue();
    if ((total) == (target))
        score = 0;
    
    score = 1.0 / ((target) - (total));
}