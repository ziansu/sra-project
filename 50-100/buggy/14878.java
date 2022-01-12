private void printItems(java.util.List<com.cserny.test.service.NavigationItem> list, java.lang.String indent) {
    for (com.cserny.test.service.NavigationItem item : list) {
        java.lang.System.out.println((indent + item));
        if ((item.getSubItems().size()) != 0) {
            java.lang.String newIndent = indent + (this.indent);
            printItems(item.getSubItems(), newIndent);
        }
    }
}