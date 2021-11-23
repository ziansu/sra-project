private void refreshPokedexOverviewPanel() {
    overviewDescription.setText(contextMaster.getCurrentMinimalPokemon().getDescription());
    overviewType1.setImageDrawable(contextMaster.getCurrentType1());
    overviewType2.setImageDrawable(contextMaster.getCurrentType2());
    overviewImage.setImageDrawable(contextMaster.getSelectionOverviewSprite());
}