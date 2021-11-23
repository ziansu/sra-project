private void AddToContacts() {
    com.insta.annuaire.pojo.AndroidContact contact = new com.insta.annuaire.pojo.AndroidContact(com.insta.annuaire.pojo.Globals.user, com.insta.annuaire.pojo.Globals.picture);
    if (contact.AddToContacts(this)) {
        android.widget.Toast.makeText(this, "Contact ajout� � votre carnet d'adresse", Toast.LENGTH_SHORT).show();
    }else {
        android.widget.Toast.makeText(this, "Impossible d'ajouter ce contact � votre carnet d'adresses", Toast.LENGTH_SHORT).show();
    }
}