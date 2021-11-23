public static com.thoughtworks.game.battleship.dto.CharWithNumber recieveCharWithNumber(java.lang.String messageForInput) {
    java.lang.System.out.println(messageForInput);
    java.lang.String content = com.thoughtworks.game.battleship.utils.UserInputUtils.scanner.nextLine();
    com.thoughtworks.game.battleship.dto.CharWithNumber charWithNumber = null;
    try {
        charWithNumber = new com.thoughtworks.game.battleship.dto.CharWithNumber(content.charAt(0), java.lang.Character.getNumericValue(content.charAt(1)));
    } catch (java.lang.Exception e) {
        charWithNumber = new com.thoughtworks.game.battleship.dto.CharWithNumber('1', (-1));
    }
    return charWithNumber;
}