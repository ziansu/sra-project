@io.github.kkysen.quicktrip.app.input.Validation
private boolean validateAddress() throws io.github.kkysen.quicktrip.app.input.AddressInputError, io.github.kkysen.quicktrip.app.input.EmptyInputError {
    if ((location) == null) {
        location = io.github.kkysen.quicktrip.app.input.AddressInputError.validate(address.getText());
    }
    return true;
}