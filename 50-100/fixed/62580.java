public void delete(forms.TripForm tripForm) {
    java.util.Date date = new java.util.Date();
    date.setDate(((date.getDate()) + 7));
    org.springframework.util.Assert.state(tripForm.getMoment().after(date));
    org.springframework.util.Assert.isTrue(isOwner(findOne(tripForm.getId())));
    tripRepository.delete(findOne(tripForm.getId()));
}