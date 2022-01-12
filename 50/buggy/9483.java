@java.lang.Override
public java.util.List<co.fddittmar.planbuilder.data.model.Program> getAllPrograms() {
    if ((repository) == null)
        android.util.Log.d("DEBUG", "Null repository");
    
    return repository.fetchAllPrograms();
}