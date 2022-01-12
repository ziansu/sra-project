public int compareAbs(BigInteger op) {
    if ((length) > (op.length)) {
        return 1;
    }else
        if ((length) < (op.length)) {
            return -1;
        }else {
            int result = 0;
            int index = 0;
            while ((result == 0) && (index < (length))) {
                result = (value[index]) - (op.value[index]);
            } 
            return result;
        }
    
}