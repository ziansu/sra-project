private void generateDynamicViews() {
    int j = 0;
    for (models.productdetails.Option option : optionArrayList) {
        if ((option.getOptionValue()) instanceof java.lang.String) {
            generateDynamicTextview(option);
        }else {
            spinnerItemList = ((java.util.ArrayList<models.productdetails.Option>) (option.getOptionValue()));
            generateDynamicSpinners(option, j);
        }
        j++;
    }
}