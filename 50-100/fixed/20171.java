private void getInformation(java.lang.String input) {
    input = removeOtherAttributes(input);
    java.lang.String[] inputs = input.split(":");
    if ((inputs.length) == 2) {
        setTitle(inputs[0].trim());
        setDescription(inputs[1].trim());
    }else {
        if (!(inputs[0].trim().isEmpty())) {
            setTitle(inputs[0].trim());
        }
    }
}