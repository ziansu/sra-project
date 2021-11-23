@java.lang.Override
public void saveReview(com.neko.service.model.Review review) {
    com.neko.entity.ReviewEntity reviewEntity = new com.neko.entity.ReviewEntity();
    com.neko.service.model.Place place = new com.neko.service.model.Place();
    reviewEntity.setPlace(place);
    reviewEntity.setText(review.getText());
    reviewRepo.save(reviewEntity);
}