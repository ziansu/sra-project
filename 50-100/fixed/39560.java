public java.lang.String create() {
    bean.Employee2101 emp = new bean.Employee2101(number, name, mail);
    try {
        db.create(emp);
        clear();
    } catch (java.lang.Exception e) {
        log.fine(((("■" + (number)) + "|") + (e.getMessage())));
    }
    return null;
}