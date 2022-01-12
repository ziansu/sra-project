public java.lang.String update() {
    bean.Employee2101 emp = new bean.Employee2101(number, name, mail);
    java.lang.System.out.println(emp);
    try {
        db.update(emp);
        clear();
    } catch (java.lang.Exception e) {
        log.createLogger().fine(((("■" + (number)) + "|") + (e.getMessage())));
    }
    return null;
}