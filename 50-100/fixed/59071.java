public float getDraw() {
    try {
        if ((draw) != null) {
            java.io.ByteArrayInputStream byin = new java.io.ByteArrayInputStream(draw);
            java.io.DataInputStream da = new java.io.DataInputStream(byin);
            float draw = da.readFloat();
            da.close();
            return draw;
        }else {
        }
    } catch (java.io.IOException e) {
    }
    return 0;
}