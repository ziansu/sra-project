private void calculateDistance(com.tagdish.domain.dto.TagDishInputDTO tagDishInputDTO, com.tagdish.domain.location.Location location, com.tagdish.domain.dto.RestaurantDishDTO restaurantDishDTO) throws com.tagdish.exception.BizServiceException {
    double distance;
    distance = -1;
    if ((calculateDistanceFlag) && (location != null)) {
        distance = locationService.calculateDistance(tagDishInputDTO, location);
    }
    restaurantDishDTO.getRestaurantDTO().setDistance(distance);
}