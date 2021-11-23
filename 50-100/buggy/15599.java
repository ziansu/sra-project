@com.ajibigad.corperwee.controller.RequestMapping(method = RequestMethod.POST)
public com.ajibigad.corperwee.model.Review addReview(@com.ajibigad.corperwee.controller.RequestBody
com.ajibigad.corperwee.model.Review review, java.security.Principal principal) {
    com.ajibigad.corperwee.model.User user = userRepository.findByUsername(principal.getName());
    if ((repository.findByUserAndPlace(user, review.getPlace())) != null) {
        review.setUser(user);
        return repository.save(review);
    }else {
        throw new com.ajibigad.corperwee.exceptions.ReviewExistAlready(review.getPlace().getName());
    }
}