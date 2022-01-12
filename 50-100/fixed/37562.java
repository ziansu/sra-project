@java.lang.Override
protected int get_delta(double d) {
    if (is_satisfied()) {
        return (java.lang.Double.compare(((left_exp.get_value()) + d), c)) != 0 ? 0 : 1;
    }else {
        return (java.lang.Double.compare(((left_exp.get_value()) + d), c)) != 0 ? -1 : 0;
    }
}