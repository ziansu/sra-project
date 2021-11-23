private void ageUp() {
    if (((age) == ((model.entity.Computer.AGE_MAX) + 1)) && (working)) {
        working = false;
        report("I'm too old, need to be replaced!");
        server.crashNotification(this);
        (age)++;
    }else
        if (working) {
            (age)++;
        }
    
}