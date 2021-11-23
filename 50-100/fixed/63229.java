public java.lang.String execute() {
    java.lang.String result = "";
    if ((targets.size()) == 0) {
        result = "There is nothing around";
    }else {
        java.lang.StringBuilder buf = new java.lang.StringBuilder();
        for (ar.fiuba.tdd.tp.server.motor.uses.Nameable nameable : targets) {
            buf.append("There is a ");
            buf.append(nameable.getName());
            buf.append(".");
        }
        result = buf.toString();
    }
    return result;
}