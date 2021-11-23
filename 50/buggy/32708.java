public void setPosition(long position) {
    try {
        this.getInputStream().getChannel().position((position - 1));
        this.position = position;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}