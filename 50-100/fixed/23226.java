@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    data = new java.util.ArrayList<>();
    db = new sattar.androidnewsapp.DBContext(android.arch.persistence.room.Room.databaseBuilder(getActivity().getApplicationContext(), sattar.androidnewsapp.AppDatabase.class, "news.db").build(), this);
    sattar.androidnewsapp.News nw = new sattar.androidnewsapp.News("Hello world", "Today is a good day to die", "drawner");
    db.InsertNewsAsync(nw);
}