public static void addStudent(int index, data.Student student) {
    data.Table table = data.Table.TABLE_LIST.get(index);
    table.appendStudent(student);
    data.Table.TABLE_LIST.remove(index);
    data.Table.TABLE_LIST.insert(index, table);
}