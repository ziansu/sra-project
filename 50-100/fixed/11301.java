private void setupAuthenticatedModel(java.lang.String results, org.springframework.ui.ModelMap model) {
    java.util.List<org.balaguta.currconv.data.entity.Conversion> history = conversionService.getHistory();
    if ((history.isEmpty()) || (results == null)) {
        model.put(org.balaguta.currconv.web.ConvertController.ATTR_CONVERSION_HISTORY, history);
    }else {
        model.put(org.balaguta.currconv.web.ConvertController.ATTR_CONVERSION_HISTORY, history.subList(1, history.size()));
        model.put(org.balaguta.currconv.web.ConvertController.ATTR_CONVERSION, history.get(0));
    }
}