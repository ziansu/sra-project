public void fillViews() {
    nameTextView.setText(event.name);
    ratingBar.setNumStars(event.rating);
    priceTextView.setText(event.displayPriceWithSeparator("\n"));
    categoryTextView.setText(event.eventCategory.name);
    timeTextView.setText(evenz.shai.com.evenz.helpers.DateHelper.dateForEventWithSeparator(event, "\n"));
    addressTextView.setText(event.fullAddress());
}