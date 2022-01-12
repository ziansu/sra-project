public void viewAllList() {
    if ((noteData.size()) == 0) {
        java.lang.System.out.println("����� ��Ʈ�� �����ϴ�.");
        return ;
    }
    java.lang.System.out.println("id\t contents");
    for (int i = 0; i < (noteData.size()); i++) {
        Note noteForView = noteData.elementAt(i);
        java.lang.System.out.println(((i + "\t ") + (noteForView.getContents())));
    }
}