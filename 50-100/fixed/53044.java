private void updateNarudzbina() {
    com.ilija.mojrestoran.model.NaruceneStavke naruceneStavke = new com.ilija.mojrestoran.model.NaruceneStavke(com.ilija.mojrestoran.AppObject.getAppInstance().getstavkaByName(autoCompleteTextView.getText().toString()), 1);
    this.naruceneStavke.add(naruceneStavke);
    konobarStavkeListAdapter.notifyDataSetChanged();
    autoCompleteTextView.setText("");
    com.ilija.mojrestoran.AppObject.getAppInstance().updateNarudzbina(narudzbina.getId(), this.naruceneStavke);
}