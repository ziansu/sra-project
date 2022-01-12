@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.util.List<T> models = new java.util.ArrayList<>();
    for (com.google.firebase.database.DataSnapshot snapshot : dataSnapshot.getChildren()) {
        T model = snapshot.getValue(this.type);
        model.setKey(snapshot.getKey());
        models.add(model);
    }
    onDataChange(models);
}