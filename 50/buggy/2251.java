public java.lang.String walk() {
    int walk = 0;
    if (normalPitch().equals("Ball!")) {
        walk++;
        if (walk == 3) {
            return "Walk!";
        }
    }
    return "";
}