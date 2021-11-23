private java.lang.String validateWeathertype(java.lang.String weatherType) {
    if ((weatherType.length()) > 25) {
        java.lang.System.out.println("Too long. Only 25 characters");
        java.lang.System.out.print("Choose weather type: ");
        weatherType = scanner.nextLine();
    }
    return weatherType;
}