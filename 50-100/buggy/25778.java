public void update(com.kirak.to.PlaceTo placeTo, int id) {
    LOG.info("Updating {}", placeTo);
    checkAllBusinessRestrictions(id);
    com.kirak.util.ValidationUtil.checkId(placeTo, id);
    com.kirak.model.City city = cityService.get(id);
    cityService.update(com.kirak.util.model.RegionUtil.updateCityFromPlaceTo(placeTo, city));
}