@java.lang.Override
public com.example.annakocheshkova.testapplication.Model.Task getTask(int id) {
    return simpleTaskDao.queryForId(id);
}