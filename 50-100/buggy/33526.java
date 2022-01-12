public void add() {
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("���� �߰��� ��Ʈ�� ������ �Է��ϼ���.(�ع��� : 1~30��)");
    java.lang.String newNoteContents = sc.nextLine();
    if (isOutOfRange(newNoteContents)) {
        java.lang.System.out.println("�Է�ũ�Ⱑ ���ָ� �ʰ��Ͽ����ϴ�.");
        if (alarmWhenCancel())
            return ;
        else
            add();
        
    }else {
        Note newNote = new Note();
        newNote.setContents(newNoteContents);
        newNote.setNote_id(noteData.size());
        noteData.add(newNote);
    }
    sc.close();
}