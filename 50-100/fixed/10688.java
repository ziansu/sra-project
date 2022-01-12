public void printFac() {
    switch (type) {
        case "integer" :
            java.lang.System.out.print(value);
            break;
        case "id" :
            java.lang.System.out.print(id);
            break;
        case "exp" :
            java.lang.System.out.print("(");
            exp.printExp();
            java.lang.System.out.print(")");
    }
}