public java.lang.String GetResult() {
    java.lang.String result = "";
    if (RunForwardsChaining()) {
        result = "YES: ";
        for (int i = 0; i < (solver.ForwardsChaining.entails.size()); i = i + 1) {
            result += (" " + (solver.ForwardsChaining.entails.get(i))) + ",";
        }
        result += " " + (solver.ForwardsChaining.query);
    }else {
        result = "NO";
    }
    return result;
}