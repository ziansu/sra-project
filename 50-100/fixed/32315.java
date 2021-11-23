public math.Scalar mul(math.MathVector v1) {
    math.Scalar t = s.get(0).add(v1.s.get(0));
    for (int i = 1; i < (v1.size); i++) {
        t.add(s.get(i).add(v1.s.get(i)));
    }
    return t;
}