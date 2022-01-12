@java.lang.Override
public void onNext(com.example.oromil.newtest.network.Model.Valute valute) {
    progressBar.setVisibility(ProgressBar.VISIBLE);
    android.util.Log.d("DB_Save", "sucsess response");
    converter.getCoursesArray(valute);
    db.openDB();
    db.clearDB();
    insertValues();
    android.util.Log.d("DB_Save", "save sucsess");
    db.closeDB();
    showItems();
    progressBar.setVisibility(ProgressBar.INVISIBLE);
}