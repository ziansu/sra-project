@java.lang.Override
public java.lang.String getInstruction() {
    java.lang.String statement = ((("call instance " + (returnType)) + " ") + (className)) + "::.ctor(";
    boolean firstArgument = true;
    for (java.lang.String argumentType : paramTypes) {
        java.lang.String comma = (firstArgument) ? "" : ", ";
        statement += comma + argumentType;
        firstArgument = false;
    }
    statement += ")";
    return statement;
}