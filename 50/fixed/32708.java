public void setPosition(long position) {
    try {
        this.getInputStream().getChannel().position(position);
        this.position = position;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}