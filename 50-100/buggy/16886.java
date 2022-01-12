private void trimEquation() {
    for (int i = 0; i < (equation.size()); i++) {
        while (!(isOperator(equation.get(i)))) {
            equation.set(i, ((equation.get(i)) + (equation.get((i + 1)))));
            i++;
        } 
    }
}