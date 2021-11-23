@java.lang.Override
public boolean delete() {
    int result = com.martji.mdbhelper.model.DataA.dao.delete(this);
    return result == 0;
}