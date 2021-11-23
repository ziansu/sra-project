@java.lang.Override
public ru.codingworkshop.gymm.data.model.ProgramTraining loadInBackground() {
    ru.codingworkshop.gymm.data.GymDbHelper dbHelper = new ru.codingworkshop.gymm.data.GymDbHelper(getContext());
    if ((id) == (ru.codingworkshop.gymm.program.activity.training.TrainingAsyncLoader.LOADER_TRAINING_SAVE)) {
        android.database.sqlite.SQLiteDatabase db = dbHelper.getWritableDatabase();
        model.create(db, 0);
        model.update(db);
    }else
        if ((id) == (ru.codingworkshop.gymm.program.activity.training.TrainingAsyncLoader.LOADER_TRAINING_LOAD)) {
            return ru.codingworkshop.gymm.data.model.ProgramTraining.load(dbHelper.getReadableDatabase(), args.getLong(MainActivity.PROGRAM_TRAINING_ID_KEY));
        }
    
    return null;
}