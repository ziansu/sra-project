public java.util.List<java.lang.String> getLabels(ui.components.pickers.LabelPickerUILogic logic) {
    return logic.getActiveLabels().entrySet().stream().filter(java.util.Map.Entry::getValue).map(java.util.Map.Entry::getKey).collect(java.util.stream.Collectors.toList());
}