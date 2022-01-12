private void trimEquation() {
    for (int i = 0; i < (equation.size()); i++) {
        int temp = i;
        while (!(isOperator(equation.get(i)))) {
            equation.set(temp, ((equation.get(i)) + (equation.get((i + 1)))));
            i++;
        } 
    }
}