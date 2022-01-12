public java.lang.String GetResult() {
    java.lang.String result = "";
    if (RunForwardsChaining()) {
        result = "YES: ";
        int i = 0;
        while (i < (solver.ForwardsChaining.entails.size())) {
            result += (" " + (solver.ForwardsChaining.entails.get(i))) + ",";
            i = i + 1;
        } 
        result += " " + (solver.ForwardsChaining.query);
    }else {
        result = "NO";
    }
    return result;
}