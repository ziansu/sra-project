public int execFac(java.util.Scanner inputFile) {
    int result = 0;
    switch (type) {
        case "integer" :
            result = value;
            break;
        case "id" :
            result = nonterminals.Id.getValue(id);
            break;
        case "exp" :
            value = exp.execExp(inputFile);
    }
    if (alternative) {
        result = result * (fac.execFac(inputFile));
    }
    return result;
}