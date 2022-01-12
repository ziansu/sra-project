public double Calculate(java.util.ArrayList<java.lang.Double> arg) throws ru.mipt.java2016.homework.base.task1.ParsingException {
    ru.mipt.java2016.homework.g595.belyh.task4.Calculator copy = new ru.mipt.java2016.homework.g595.belyh.task4.Calculator();
    for (int i = 0; i < (arg.size()); i++) {
        copy.addVariable(variable.get(i), arg.get(i).toString());
    }
    return copy.calculate(s);
}