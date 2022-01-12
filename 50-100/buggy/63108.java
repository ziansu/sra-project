private void refreshPokedexOverviewPanel() {
    overviewDescription.setText(contextMaster.getCurrentMinimalPokemon().getDescription());
    overviewType1.setImageDrawable(new android.graphics.drawable.BitmapDrawable(getResources(), contextMaster.getCurrentType1()));
    overviewType2.setImageDrawable(new android.graphics.drawable.BitmapDrawable(getResources(), contextMaster.getCurrentType2()));
    overviewImage.setImageBitmap(android.graphics.BitmapFactory.decodeStream(contextMaster.getSelectionOverviewSprite()));
}