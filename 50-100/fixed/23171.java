public Cmd toCmd() {
    input.trim();
    java.lang.String[] inputArr = input.split(OneTagParser.SPACE);
    if ((inputArr.length) == 1) {
        return parseOneWordCmd();
    }else {
        return parseLongInput();
    }
}