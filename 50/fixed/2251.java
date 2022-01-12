public java.lang.String walk() {
    int walk = 0;
    if (normalPitch().equals("Ball!")) {
        walk++;
        if (walk == 3) {
            java.lang.System.out.println("Walk!");
            return "Walk!";
        }
    }
    return "";
}