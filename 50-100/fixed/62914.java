public void update(Calc calc) {
    for (int i = 0; i < (calcs.size()); i++) {
        if (calcs.get(i).getId().equals(calc.getId())) {
            calcs.set(i, calc);
        }
    }
}