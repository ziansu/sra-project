@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list_note);
    edu.byui.cs246.bookwarm.Book thisBook = ((edu.byui.cs246.bookwarm.Book) (getIntent().getSerializableExtra("thisBook")));
    listNotes = thisBook.getNotes();
    displayNotes();
    setupAddNoteButton();
}