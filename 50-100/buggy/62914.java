public void update(Calc calc) {
    for (int i = 0; i < (calcs.length); i++) {
        if (calcs[i].getId().equals(calc.getId())) {
            calcs[i] = calc;
        }
    }
}