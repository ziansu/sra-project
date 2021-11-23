public void push(long value) {
    if (value > (worst))
        worst = value;
    
    if ((best) > value)
        best = value;
    
    history.add(value);
}