public java.lang.Character getNext() {
    try {
        if ((character) == '\n') {
            (line)++;
            column = 1;
        }else {
            (column)++;
        }
        return character = ((char) (bufferedReader.read()));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return ' ';
}