static void chooseNote(java.util.List<Note> notes, java.io.BufferedReader reader) throws java.io.IOException {
    java.lang.System.out.format("%nType the note number to look through the note or 0 to back to the menu%n");
    int n = java.lang.Integer.parseInt(reader.readLine());
    while ((n < 1) || (n >= (notes.size()))) {
        if (n == 0)
            return ;
        
        java.lang.System.out.println("Can't find this note, try again");
        n = java.lang.Integer.parseInt(reader.readLine());
    } 
    NotebookService.printNote(notes, (n - 1), reader);
}