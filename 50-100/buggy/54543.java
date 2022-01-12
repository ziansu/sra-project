@java.lang.Override
public java.lang.Object next() {
    if ((index) >= (value.length())) {
        return finished_.get_();
    }
    while (true) {
        int result = value.indexOf(str, index);
        if (result < 0) {
            return finished_.get_();
        }
        count += value.codePointCount(index, result);
        long c = count;
        index = result + (len);
        (count)++;
        return java.lang.Integer.instance(c);
    } 
}