@java.lang.Override
public org.nd4j.linalg.dataset.DataSet next(int num) {
    if (train) {
        while (((cursor) > (lowerBound)) && ((cursor) < (upperBound))) {
            cursor += num;
            iter.next(num);
        } 
        cursor += num;
        return iter.next(num);
    }else {
        while ((cursor) < (lowerBound)) {
            cursor += num;
            iter.next(num);
        } 
        cursor += num;
        return iter.next(num);
    }
}