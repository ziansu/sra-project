public Cmd toCmd(java.lang.String input) {
    input.trim();
    java.lang.String[] inputArr = input.split(OneTagParser.SPACE);
    if ((inputArr.length) == 1) {
        return parseOneWordCmd(input);
    }else {
        return parseLongInput(input);
    }
}