public void dump() {
    java.lang.System.out.println(("Name: " + (name.toString())));
    java.lang.System.out.println(("Return Type: " + (symtable.Types.toStr(retType))));
    java.lang.System.out.println("Formals: ");
    for (int i = 0; i < (formals.size()); i++) {
        java.lang.System.out.print(((formals.get(i).toString()) + " "));
    }
    java.lang.System.out.print(("Local variables: " + (locals.dump())));
}