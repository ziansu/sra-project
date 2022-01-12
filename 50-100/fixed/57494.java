public java.lang.String substring(int start) {
    if ((0 <= start) && (start <= (count))) {
        if (start == (count))
            return "";
        
        shared = true;
        return new java.lang.String(value, start, ((count) - start));
    }
    throw new java.lang.StringIndexOutOfBoundsException(start);
}