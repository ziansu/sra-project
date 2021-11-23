private int lineEnd(int index) {
    if (index <= 0) {
        return 0;
    }
    switch (this.text.charAt((index - 1))) {
        case '\n' :
            if ((index > 1) && ((this.text.charAt((index - 2))) == '\r')) {
                return index - 2;
            }
        case '\r' :
            return index - 1;
    }
    return index;
}