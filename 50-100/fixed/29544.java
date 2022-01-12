public void setSelectedRadio(java.lang.String selectedRadio) {
    if (selectedRadio.equals(options.get(0))) {
        firstOption.setChecked(true);
        secondOption.setChecked(false);
    }else
        if (selectedRadio.equals(options.get(1))) {
            firstOption.setChecked(false);
            secondOption.setChecked(true);
        }else {
            firstOption.setChecked(false);
            secondOption.setChecked(false);
        }
    
}