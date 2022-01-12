@java.lang.Override
protected int get_delta(double d) {
    if ((is_satisfied()) && ((java.lang.Double.compare(d, 0)) != 0)) {
        return 1;
    }else {
        if ((java.lang.Double.compare(((left_exp.get_value()) + d), c)) != 0) {
            return -1;
        }else {
            return 0;
        }
    }
}