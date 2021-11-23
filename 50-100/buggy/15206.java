void editItem(int n, java.lang.String[] it) {
    daList.remove(n);
    int id = java.lang.Integer.valueOf(it[0]);
    main.Item x = new main.Item(id, java.lang.Double.valueOf(it[3]), it[2], it[1], java.lang.Integer.valueOf(it[4]));
    daList.add(n, x);
}