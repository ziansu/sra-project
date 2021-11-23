public de.magic.creation.repo.ZvgObjectDetail details(de.magic.creation.repo.ZvgObject zvgObject) {
    de.magic.creation.repo.ZvgObjectDetail details = zvgObject.getDetails();
    details = searchManagerWeb.details(zvgObject.getId(), zvgObject.getLand().getValue());
    if (details != null) {
        zvgObject.setDetails(details);
        zvgObject = zvgObjectRepository.save(zvgObject);
        return zvgObject.getDetails();
    }
    return details;
}