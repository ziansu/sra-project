@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot ds : dataSnapshot.getChildren()) {
        list.add(ds.getValue(br.com.sardinha.iohan.eventos.Usuario.class));
    }
    recyclerView.setAdapter(new br.com.sardinha.iohan.eventos.confirmarPresentesAdapter(list, eventID));
}