private boolean isDefaultPreset(org.gephi.preview.api.PreviewPreset preset) {
    int i;
    for (i = 0; i < (presetComboBox.getItemCount()); i++) {
        if (presetComboBox.getModel().getElementAt(i).equals(preset)) {
            break;
        }
    }
    return i < (defaultPresetLimit);
}