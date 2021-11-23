public void searchDocuments() {
    java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Enter the title of a document to search for");
    java.lang.String query = scan.nextLine();
    edu.txstate.library.Book search = new edu.txstate.library.Book();
    search.setTitle(query);
    if (documents.contains(search)) {
        for (edu.txstate.library.Document doc : documents) {
            if (doc.equals(search))
                java.lang.System.out.println(doc.toString());
            
        }
    }
    scan.close();
}