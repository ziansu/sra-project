private void addIdea() throws java.io.IOException {
    java.lang.System.out.print("Enter idea ID: ");
    java.lang.String idIdea = sc.nextLine();
    java.lang.System.out.print("Enter idea description: ");
    java.lang.String desc = sc.nextLine();
    java.lang.System.out.print("Enter student ID: ");
    java.lang.String idStudent = sc.nextLine();
    java.lang.System.out.print("Enter student mail: ");
    java.lang.String mailStudent = sc.nextLine();
    output.write(((protocol.addIdea(idIdea, desc, idStudent, mailStudent)) + "\r\n"));
    output.flush();
}