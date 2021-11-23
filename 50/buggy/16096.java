@java.lang.Override
public void changeNameToFileName(java.util.List<rjm.romek.source.model.Country> countries) {
    for (rjm.romek.source.model.Country country : countries) {
        country.setFlag(((parameters.getFlagDir()) + (translatorService.translateToFileName(country.getFlag()))));
    }
}