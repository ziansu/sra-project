private void updateNarudzbina() {
    com.ilija.mojrestoran.model.NaruceneStavke naruceneStavke = new com.ilija.mojrestoran.model.NaruceneStavke(com.ilija.mojrestoran.AppObject.getAppInstance().getstavkaByName(autoCompleteTextView.getText().toString()), 1);
    narudzbina.getNenaplaceneStavke().add(naruceneStavke);
    com.ilija.mojrestoran.AppObject.getAppInstance().updateRestoranBase();
    konobarStavkeListAdapter.notifyDataSetChanged();
    autoCompleteTextView.setText("");
}