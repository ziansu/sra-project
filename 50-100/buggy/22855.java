@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    br.com.sardinha.iohan.eventos.Usuario user = dataSnapshot.getValue(br.com.sardinha.iohan.eventos.Usuario.class);
    user.setEventosConfirmados(((user.getEventosConfirmados()) + 1));
    if (!(CLICKED)) {
        usersReference.child(user.getId()).setValue(user);
        usersParticipatingReference.child(list.get(position).getId()).removeValue();
        list.remove(position);
        notifyDataSetChanged();
    }
    CLICKED = true;
}