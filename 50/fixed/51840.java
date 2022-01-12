public void sensitiveSearch(java.lang.String text) {
    java.lang.System.out.println(text);
    if (text != null) {
        this.view.getTable().search(text);
    }else {
        this.view.getTable().update();
    }
}