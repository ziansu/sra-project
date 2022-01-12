public de.magic.creation.repo.ZvgObjectDetail details(de.magic.creation.repo.ZvgObject zvgObject) {
    de.magic.creation.repo.ZvgObjectDetail details = zvgObject.getDetails();
    if (details != null)
        return details;
    
    details = searchManagerWeb.details(zvgObject.getId(), zvgObject.getLand().getValue());
    if (details != null) {
        zvgObject.setDetails(details);
        zvgObjectRepository.save(zvgObject);
    }
    return details;
}