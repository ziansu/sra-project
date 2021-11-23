public char[] next(int n) {
    char[] result = new char[n];
    for (int i = 0; i < n; i++) {
        (this.position)++;
        if ((this.position) > (this.length)) {
            result[i] = NULL;
        }else {
            result[i] = this.text[position];
        }
    }
    return result;
}