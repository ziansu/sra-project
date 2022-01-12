public void goToPreviousSerie(android.view.View v) {
    ar.com.tzulberti.archerytraining.model.base.ISerie transitionSerie = this.serie.getContainer().getSeries().get(((this.serie.getIndex()) - 2));
    android.content.Intent intent = new android.content.Intent(this, ar.com.tzulberti.archerytraining.activities.common.AbstractSerieArrowsActivity.class);
    intent.putExtra(ar.com.tzulberti.archerytraining.activities.common.AbstractSerieArrowsActivity.SERIE_ARGUMENT_KEY, transitionSerie);
    startActivity(intent);
}