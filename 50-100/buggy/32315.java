public math.Scalar mul(math.MathVector v1) {
    if ((v1.size) == (this.size)) {
        math.Scalar t = s.get(0).add(v1.s.get(0));
        for (int i = 0; i < (v1.size); i++) {
            t.add(s.get(i).add(v1.s.get(i)));
        }
        return t;
    }
    return null;
}