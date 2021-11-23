public boolean contains(T o, java.lang.String search) {
    search = "";
    if (((MyList) (o)).contains(search)) {
        java.lang.System.out.println(o);
        return true;
    }
    return false;
}