private boolean isInputValid() {
    if (searchBox.getText().isEmpty()) {
        return false;
    }else
        if ("".equals(searchOptions.getText())) {
            return false;
        }
    
    return true;
}