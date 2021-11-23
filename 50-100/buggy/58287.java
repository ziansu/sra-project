private int lineEnd(int index) {
    char c = this.text.charAt((index - 1));
    switch (c) {
        case '\n' :
            if ((this.text.charAt((index - 2))) == '\r') {
                return index - 2;
            }
        case '\r' :
            return index - 1;
    }
    return index;
}