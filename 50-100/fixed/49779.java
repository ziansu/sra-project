@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == 1) {
        if (resultCode == (RESULT_OK)) {
            com.example.daniel.teamdo.Person p = new com.example.daniel.teamdo.Person();
            p.setName(data.getStringExtra("Name"));
            p.setOrganisation(data.getStringExtra("Orga"));
            p.setBeruf(data.getStringExtra("Beruf"));
            me = p;
        }
    }
}