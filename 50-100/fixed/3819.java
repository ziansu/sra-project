public java.lang.String update() {
    bean.Employee2101 emp = new bean.Employee2101(number, name, mail);
    try {
        db.update(emp);
        clear();
    } catch (java.lang.Exception e) {
        log.fine(((("■" + (number)) + "|") + (e.getMessage())));
    }
    return null;
}