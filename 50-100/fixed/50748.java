@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot pesansnapshot : dataSnapshot.getChildren()) {
        id.sch.smktelkom_mlg.project2.xirpl608202231.mocha.Pesan pesan = pesansnapshot.getValue(id.sch.smktelkom_mlg.project2.xirpl608202231.mocha.Pesan.class);
        pesanList.add(pesan);
    }
    id.sch.smktelkom_mlg.project2.xirpl608202231.mocha.PesanList adapter = new id.sch.smktelkom_mlg.project2.xirpl608202231.mocha.PesanList(getActivity(), pesanList);
    listViewpesan.setAdapter(adapter);
    notif();
}