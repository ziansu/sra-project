public static com.zipcodewilmington.phone.PhoneNumber[] createRandomPhoneNumberArray(int phoneNumberCount) {
    com.zipcodewilmington.phone.PhoneNumber[] numbers = new com.zipcodewilmington.phone.PhoneNumber[5];
    int numberOfRandoms = 0;
    while (numberOfRandoms < 5) {
        com.zipcodewilmington.phone.PhoneNumber number = com.zipcodewilmington.phone.PhoneNumberFactory.createRandomPhoneNumber();
        if (number != null) {
            numbers[numberOfRandoms] = number;
            numberOfRandoms++;
        }
    } 
    return numbers;
}